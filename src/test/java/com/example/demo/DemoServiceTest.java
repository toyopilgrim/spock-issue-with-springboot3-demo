package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {DemoPostConstruct.class})
class DemoServiceTest {

  @Test
  void demoTestMethod() {
    final var res = new DemoService().demo();

    assertEquals(res, "OK");
  }

}