package com.flowdy.demoreactive.service;

import com.flowdy.demoreactive.domain.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
  public Greeting greets(String name) {
    return new Greeting(name);
  }
}
