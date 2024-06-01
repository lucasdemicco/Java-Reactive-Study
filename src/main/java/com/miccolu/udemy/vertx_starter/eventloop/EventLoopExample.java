package com.miccolu.udemy.vertx_starter.eventloop;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class EventLoopExample extends AbstractVerticle {

  private static final Logger LOG = LoggerFactory.getLogger(EventLoopExample.class);

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx(
      new VertxOptions()
        .setMaxEventLoopExecuteTime(500)
        .setMaxEventLoopExecuteTimeUnit(TimeUnit.MILLISECONDS)
        .setBlockedThreadCheckInterval(1)
        .setMaxEventLoopExecuteTimeUnit(TimeUnit.SECONDS));

    vertx.deployVerticle(EventLoopExample.class.getName());
  }

  @Override
  public void start(final Promise<Void> promise) throws Exception {
    LOG.info("Starting event loop..." + getClass().getName());
    promise.complete();
    Thread.sleep(5000);
  }
}
