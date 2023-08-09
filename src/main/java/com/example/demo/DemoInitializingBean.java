package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class DemoInitializingBean implements InitializingBean {
  private static DemoInitializingBean instance;

  @Autowired
  private MessageSource messageSource;

  public static void doSomething() {
      System.out.println(instance.messageSource.toString());
  }

  @Override
  public void afterPropertiesSet() {
    instance = this;
  }
}
