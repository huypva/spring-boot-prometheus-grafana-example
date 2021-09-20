package io.codebyexample.springbootprometheusgrafana.core.usercase;

import io.micrometer.core.annotation.Timed;
import java.util.Random;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Component
public class GreetImpl implements Greet {

  @Override
  public String greeting() {
    Random random = new Random();
    if (random.nextInt(100) < 20) {
      throw new RuntimeException("Test fail");
    }
    return "Hello World!";
  }
}
