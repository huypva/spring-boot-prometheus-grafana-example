package io.codebyexample.springbootprometheusgrafana.core.usercase;

import io.micrometer.core.annotation.Timed;

/**
 * @author huypva
 */
public class GreetImpl implements Greet {

  @Timed(value = "greeting.time", description = "Time taken to return greeting", percentiles = {0.5, 0.90})
  @Override
  public String greet(String name) {
    return "Hello " + name;
  }
}
