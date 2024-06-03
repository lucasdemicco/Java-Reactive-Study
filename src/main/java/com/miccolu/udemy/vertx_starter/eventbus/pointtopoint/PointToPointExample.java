package com.miccolu.udemy.vertx_starter.eventbus.pointtopoint;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class PointToPointExample {
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(Sender.class.getName());
    vertx.deployVerticle(Receiver.class.getName());
  }

  static class Sender extends AbstractVerticle{
    private static final Logger LOG = LoggerFactory.getLogger(Sender.class);
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      LOG.debug("Starting Sender example");
      startPromise.complete();
      vertx.setPeriodic(2000, id -> {
        //Send message an 2 seconds
        vertx.eventBus().send(Sender.class.getName(), "Sending message...");
      });
    }
  }

  static class Receiver extends AbstractVerticle{
    private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      LOG.debug("Starting Receiver example");
      startPromise.complete();
      vertx.eventBus().consumer(Sender.class.getName(), message -> {
        LOG.debug(message.body());
      });
    }
  }
}
