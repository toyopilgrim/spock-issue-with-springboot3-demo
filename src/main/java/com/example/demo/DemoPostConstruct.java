package com.example.demo;

import jakarta.annotation.PostConstruct;
//import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class DemoPostConstruct {
  private static DemoPostConstruct instance;

  @Autowired
  private MessageSource messageSource;


  @PostConstruct
  private void registerInstance() {
    // This isn't triggered on GroovySpock SpringBootTest initialization.
    instance = this;
  }

  public static void doSomething() {
      System.out.println(instance.messageSource.toString());
  }
}
