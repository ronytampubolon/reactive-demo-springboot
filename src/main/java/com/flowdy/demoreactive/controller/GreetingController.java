package com.flowdy.demoreactive.controller;

import com.flowdy.demoreactive.domain.Greeting;
import com.flowdy.demoreactive.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

  @Autowired GreetingService greetingService;

  @GetMapping("/rest/hello")
  public ResponseEntity<Greeting> greet(@RequestParam String name) {
    return new ResponseEntity<>(greetingService.greets(name), HttpStatus.OK);
  }

  @GetMapping("/reactive/hello")
  public Mono<ResponseEntity<Greeting>> helloReactive(@RequestParam String name) {
    return Mono.just(new ResponseEntity<>(greetingService.greets(name), HttpStatus.OK));
  }
}
