package tw.com.wade.playground.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BaseController {

  @GetMapping("/")
  public String index() {

    return "Hello World.";
  }

}
