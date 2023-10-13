package com.flowdy.demoreactive.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {
  GreetingService greetingService = new GreetingService();

  @Test
  public void testGreet() {
    assertNotNull(greetingService.greets("Jhon"));
  }
}
