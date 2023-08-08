package com.example.demo;

public class DemoService
{
  public String demo(){
    DemoPostConstruct.doSomething();
    return "OK";
  }
}
