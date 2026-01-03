
package com.example.demo.controller;
import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import org.springframework.web.bind.annotation.*;
@RestController
public class HelloController {
  private final GreetingService greetingService;
  public HelloController(GreetingService greetingService) { this.greetingService = greetingService; }
  @GetMapping("/api/hello")
  public Greeting hello(@RequestParam(required=false) String name) {
    return new Greeting(greetingService.greet(name));
  }
}
