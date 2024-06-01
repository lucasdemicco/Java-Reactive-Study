package com.miccolu.udemy.vertx_starter.eventbus.exampleClass;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class ResponseVerticle extends AbstractVerticle {

  private static final Logger LOG = LoggerFactory.getLogger(ResponseVerticle.class);
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOG.debug("Received message");
    startPromise.complete();
    vertx.eventBus().consumer(RequestVerticle.ADDRESS, message -> {
      LOG.debug(message.body());
    });
  }
}
