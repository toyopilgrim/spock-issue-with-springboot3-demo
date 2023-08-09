package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {DemoPostConstruct.class, DemoInitializingBean.class})
class DemoServiceTest {

  @Test
  void demoPostConstruct() {
    final var res = new DemoService().demoPostConstruct();

    assertEquals(res, "OK");
  }

  @Test
  void demoInitializingBean() {
    final var res = new DemoService().demoInitializingBean();

    assertEquals(res, "OK");
  }
}