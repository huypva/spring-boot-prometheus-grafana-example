package io.codebyexample.springbootprometheusgrafana.entrypoint;

import io.codebyexample.springbootprometheusgrafana.core.usercase.Greet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huypva
 */
@Controller
public class GreetingController {

  private Greet greet;

  @GetMapping("/greet")
  public String greet(@RequestParam(value = "name") String name) {
    return greet.greet(name);
  }
}
