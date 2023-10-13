package com.flowdy.demoreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class DemoReactiveApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context =
        SpringApplication.run(DemoReactiveApplication.class, args);
  }
}
