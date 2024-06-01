package com.miccolu.udemy.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleAA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> promise) throws Exception {
    System.out.println("Sou o Verticle AA: " + getClass().getName());
    promise.complete();
  }

  @Override
  public void stop(Promise<Void> promise) throws Exception {
    System.out.println("Stop " + VerticleAA.class.getName());
    promise.complete();
  }
}
