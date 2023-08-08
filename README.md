# Spock spec doesn't invoke a method with @PostConstruct after upgrading SpringBoot to 3.x

* After upgrading Spring Boot to 3.x, Spock specs started to fail because @PostConstruct isn't triggered. 
* In this demo, `DemoServiceSpec` fails while `DemoServiceTest`(normal JUnit) passes. 
* For instance, when switching the Spring Boot to 2.7.4, `DemoServiceSpec` passess. 