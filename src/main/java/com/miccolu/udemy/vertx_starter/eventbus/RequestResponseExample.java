package com.miccolu.udemy.vertx_starter.eventbus;

import com.miccolu.udemy.vertx_starter.eventbus.exampleClass.RequestVerticle;
import com.miccolu.udemy.vertx_starter.eventbus.exampleClass.ResponseVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class RequestResponseExample extends AbstractVerticle {
  private static final Logger LOG = LoggerFactory.getLogger(RequestResponseExample.class);
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(RequestVerticle.class.getName());
    vertx.deployVerticle(ResponseVerticle.class.getName());
  }
}
