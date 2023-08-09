package com.example.demo;

public class DemoService
{
  public String demoPostConstruct(){
    DemoPostConstruct.doSomething();
    return "OK";
  }

  public String demoInitializingBean(){
    DemoInitializingBean.doSomething();
    return "OK";
  }
}
