# Spock spec doesn't invoke a method with @PostConstruct after upgrading SpringBoot to 3.x

* After upgrading Spring Boot to 3.x, Spock specs started to fail because @PostConstruct isn't triggered. 
* In this demo, `DemoServiceSpec` fails while `DemoServiceTest`(normal JUnit) passes. 
* For instance, when switching the Spring Boot to 2.7.4, `DemoServiceSpec` passess. 

# Solution 

Upgrade 2.3 to 2.4-M1

```
testImplementation 'org.spockframework:spock-core:2.4-M1-groovy-4.0'
testImplementation 'org.spockframework:spock-spring:2.4-M1-groovy-4.0'
```