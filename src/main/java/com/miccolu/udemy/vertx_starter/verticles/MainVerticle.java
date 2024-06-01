package com.miccolu.udemy.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

import java.util.UUID;

public class MainVerticle extends AbstractVerticle {

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());
  }

  @Override
  public void start(final Promise<Void> promise) throws Exception {
    System.out.println("Start" + getClass().getName());
    vertx.deployVerticle(VerticleA.class.getName());
    vertx.deployVerticle(new VerticleB(),
      new DeploymentOptions().setConfig(new JsonObject()
        .put("id", UUID.randomUUID().toString())
        .put("name", VerticleB.class.getName())));

    promise.complete();
  }
}
