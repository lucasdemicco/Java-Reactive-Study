package com.miccolu.udemy.vertx_starter.worker;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.LoggerFactory;
import io.vertx.core.impl.logging.Logger;

public class WorkerExample extends AbstractVerticle {

  private static final Logger LOG = LoggerFactory.getLogger(WorkerExample.class);

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(WorkerExample.class.getName());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOG.debug("Starting Worker application: " + getClass().getName());
    startPromise.complete();
    executeBlockingAsync();
  }

  private void executeBlockingAsync() {
    vertx.executeBlocking(event -> {
      LOG.debug("Executing blocking code");
        try {
            Thread.sleep(5000);
            event.complete(); //Executing Thread 0
        } catch (InterruptedException e) {
            LOG.error("Failed: %s", e);
            event.fail(e);
        }
    }, asyncResult -> { //Get result to execute Thread 0
      if(asyncResult.succeeded()){
        LOG.debug("Blocking call Done.");
      }else{
        LOG.error("Blocking failed: ", asyncResult.cause());
      }
    });
  }
}
