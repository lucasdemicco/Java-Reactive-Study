package com.miccolu.udemy.vertx_starter.eventbus.publishsubscribe;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class PublishSubscribeExample {
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(Publisher.class.getName());
    vertx.deployVerticle(Subscriber.class.getName());
  }

  static class Publisher extends AbstractVerticle{
    private static final Logger LOG = LoggerFactory.getLogger(Publisher.class);
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.setPeriodic(2000, id -> {
        LOG.debug("Sending message...");
        vertx.eventBus().publish(Publisher.class.getName(), "Sending a message");
      });
    }
  }

  static class Subscriber extends AbstractVerticle{
    private static final Logger LOG = LoggerFactory.getLogger(Subscriber.class);
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.eventBus().consumer(Publisher.class.getName(), message->{
        LOG.debug(message.body());
      });
    }
  }
}
