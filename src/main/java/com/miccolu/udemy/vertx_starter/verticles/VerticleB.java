package com.miccolu.udemy.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

import java.util.UUID;

public class VerticleB extends AbstractVerticle {

  @Override
  public void start(final Promise<Void> promise) throws Exception {
    System.out.println("Event B " + getClass().getName());
    vertx.deployVerticle(VerticleBB.class.getName(),
      new DeploymentOptions()
        .setInstances(4));
    System.out.println("Class B have a config json " + config().toString());
    promise.complete();
  }
}
