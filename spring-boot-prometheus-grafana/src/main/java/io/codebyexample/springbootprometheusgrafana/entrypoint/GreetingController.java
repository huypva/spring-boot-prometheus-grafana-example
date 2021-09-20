package io.codebyexample.springbootprometheusgrafana.entrypoint;

import io.codebyexample.springbootprometheusgrafana.core.usercase.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huypva
 */
@RestController
public class GreetingController {

  @Autowired
  private Greet greet;

  @GetMapping("/greeting")
  public String greeting() {
    return greet.greeting();
  }
}
