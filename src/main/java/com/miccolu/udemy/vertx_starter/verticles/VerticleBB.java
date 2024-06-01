package com.miccolu.udemy.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleBB extends AbstractVerticle {

  @Override
  public void start(final Promise<Void> promise) throws Exception {
    System.out.println("Event BB " + getClass().getName());
    promise.complete();
  }
}
