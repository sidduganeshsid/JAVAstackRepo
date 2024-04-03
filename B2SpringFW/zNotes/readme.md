/408
13

# Title : [NEW] Master Spring Boot 3 & Spring Framework 6 with Java



>About this course
Become **Java SpringBoot Full Stack Cloud Developer**. 
Learn **AWS, React, Docker, Spring Data JPA & Spring Security.**

# Sec 1 : instruction - how to follow the course
Instructions
# Sec 2 : Getting Started with Spring Framework

## 7.CODE BACKUP and STEP BY STEP CHANGES : For Coding Reference and Debugging
I'm really delighted to have the privilege of being your instructor for this course! I welcome you to another awesome section!



👉 Bookmark the GitHub folder for this section

https://github.com/in28minutes/master-spring-and-spring-boot/tree/main/01-spring



👉 Help for Debugging Problems

Here's the code backup at the end of step 05: https://github.com/in28minutes/master-spring-and-spring-boot/blob/main/01-spring/01-Step05.md

Step by Step changes are detailed here: https://github.com/in28minutes/master-spring-and-spring-boot/blob/main/01-spring/step-by-step-code-changes/step-by-step-guide.md



I will see you in the next lecture.



Happy Learning,

Ranga



## 8.
Web Apps
REST API
FULL STACK
Microservices

![alt text](image.png)

## 9. Maximize with speed learning 


## 10. Getting started with SpringFW

## 11. step 03 crating anew spring FW project with mavan and java
https://start.spring.io/
don't use snapshot version of spring boot that are meant for development and testing (currently being developed by the spring team)
![alt text](image-1.png)

![alt text](image-2.png)
select the downloaded and extracted folder.

## 12. step04 : Getting started with the java gaming application

mairo game classes
everything is tightly coupled
**Tightly Coupled** : when one class is dependent on another class, it is called tightly coupled

## 13. step 05 : understand the tight coupling and loose coupling
MainGameApplication
marioGame
superContraGame
GameRunner
**understand the tight coupling and loose coupling with the above example**

## 14 
![alt text](image-3.png)
iteration 2 : Loose coupling with interface
AppGamingBasic.java (main class)
MarioGame.java
SuperContraGame.java
GameRunner.java (dont need to make any changes)
GamingConsole.java (interface)
GameRunner -> GamingConsole -> MarioGame , SuperContraGame , PacManGame
interface is something which represents the common actions that can be performed on a specific set of classes.

## 15 bringing spfw to make java app for loose coupling

![alt text](image-4.png)

## 16 first spring bean and launch fw
![alt text](image-5.png)

## 17 creating more java spring beans in spring java configuration file.


## 18
attribute to @Bean

## 19
BeanFactory is used for some kind of an IoT application.
where severly contrained for memory

## 22 Step 13 - Exploring Java Bean vs POJO vs Spring Bean
java bean vs spring bean vs pojo
plain old java object.

POJO =Any Java object is a pojo,
![alt text](image-6.png)

EJB introducted the Java bean.
java bean should have
1. public no-arg constructor
2. getters and setters
3. implements serializable interface
then an instance of a class is called a java bean

## 23  Exploring Spring Framework Bean Auto Wiring - Primary & Qualifier

//functional programming
Arrays.steam()
context.getBeanDEfinitionNames()).foreach(System.out::println);

![alt text](image-7.png)

![alt text](image-8.png)

autowiring of qualifier  
![alt text](image-9.png)

```java

package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor, 
//equals, hashcode and toString are automatically created. 
//Released in JDK 16.

record Person (String name, int age, Address address) { };

//Address - firstLine & city
record Address(String firstLine, String city){ };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));		
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //name, age		
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		//name,age,address2
		return new Person(name, age, address3); //name, age		
	}

	@Bean
	@Primary
	//No qualifying bean of type 'com.in28minutes.learnspringframework.Address' 
	//available: expected single matching bean but found 2: address2,address3
	public Person person4Parameters(String name, int age, Address address) {
		//name,age,address2
		return new Person(name, age, address); //name, age		
	}

	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		//name,age,address2
		return new Person(name, age, address); //name, age		
	}

	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Baker Street", "London");		
	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");		
	}

}

```
![alt text](image-10.png)

![alt text](image-11.png)

![alt text](image-12.png)

![alt text](image-13.png)

## 26
![alt text](image-14.png)
lets explore below
![alt text](image-15.png)

# Section 3 : using sfw create and manage the java objects.

## 30. Step 02 - Exploring Primary and Qualifier Annotations for Spring Components

@Component on MarioGame
so to stop conflict
then use @Primary on one of the beans

## 31. Step 03 - Primary and Qualifier - Which Spring Annotation Should You Use?


if @Qualifier is not given to the bean
but you can call it by the name of the bean of it's class name in small letter of first letter.
```java

@Qualifier("r") //for RadixSorting bean
```
![alt text](image-16.png)

## 32 Step 04 - Exploring Spring Framework - Different Types of Dependency Injection

Autowired is not required for constructor injection


## 38
![alt text](image-17.png)


![alt text](image-18.png)

![alt text](image-19.png)

## 39. How to remember for long time, is consistency ?
![alt text](image-20.png)


# Section 4 : Advanced Concepts in Spring Framework

## 41. Exploring Lazy and Eager Initialization of Spring Framework Beans

Lazy is something you would not need to use frequently,

but if you have a lot

of complex initialization logic and if you dont

want it to delay this tied up,

in those kind of situations,

you can think about lazy initialization of Spring Beans.

However, it is very, very important to remember

that if you are making use of lazy initialization errors

in spring configuration will not be discovered

at application startup.

They will become runtime errors.

## 42. 
![alt text](image-23.png)
@Lazy 
//loads only when it is called
![alt text](image-24.png)
value = "PROTOTYPE" 

= instance of normal method is same but different instance of prototype

![alt text](image-25.png)
![alt text](image-26.png)
![alt text](image-27.png)


![alt text](image-28.png)

![alt text](image-29.png)


for next lecture
/learn-spring-framework-02/src/main/resources/contextConfiguration.xml New
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->
	
 	
</beans>
```


## 49
![alt text](image-31.png)
![alt text](image-30.png)

![alt text](image-32.png)

![alt text](image-33.png)

individual creation
![alt text](image-34.png)

![alt text](image-35.png)

![alt text](image-36.png)


## 51
![alt text](image-37.png)

## 52
Spring Framework needs to identify the beans.

It needs to identify their dependencies

and it would need to wire the dependencies into the beans.

This entire process is what is called dependency injection.

This is also called inversion of control.

Earlier, programmers used to write the code

to create objects to wire objects together

and now the responsibility for creating objects

and binding objects is transferred to the Spring Framework

and that's why this is also called inversion of control.

Now, there are three types of dependency injections:

constructor injection, setter injection

and field injection.

If you're calling a constructor

to inject the dependencies in,

it's called constructor injection.

If you're making use of the setter methods

to inject the dependencies on your beans,

then you're making use of setter injection.

When you don't have a setter or a constructor,

Spring Framework injects the dependency using reflection

and this is called field injection,

IOC container or the inversion of control container.

This is nothing but the Spring inversion of control context

that manages Spring beans and their lifecycle.

The IOC container is responsible for creation

of the beans, their entire life and their termination.

There are two types of Spring IOC containers.

One is BeanFactory, which is a basic Spring IOC container.

And the second type, which is most frequently used,

which is almost used all the time, is application context.

This is advanced Spring IOC container

with enterprise-ready features.

It is easy to use in web applications.

It provides you with internationalization features

and also, it provides good integration with Spring AOP.

Spring beans are nothing

but objects that are managed by Spring.

Any object that is managed

by Spring is called a Spring bean.

And the last terminology is auto-wiring.

Whenever you have Spring beans, they have dependencies.

Spring needs to find the right dependency

and wire it into the bean.

This process is what is called auto-wiring.


Spring needs to find the right dependency
and wire it into the bean.
This process is what is called auto-wiring.

![alt text](image-38.png)


![alt text](image-39.png)


![alt text](image-40.png)

![alt text](image-41.png)

---

![alt text](image-42.png)
![alt text](image-43.png)

![alt text](image-44.png)
![alt text](image-45.png)

![alt text](image-46.png)

![alt text](image-47.png)

![alt text](image-48.png)

![alt text](image-49.png)
![alt text](image-50.png)

![alt text](image-51.png)

## How to stay uptodate with technologies evolutions
![alt text](image-52.png)

![alt text](image-53.png)






+++++++++++++++++++
![alt text](image-21.png)

![alt text](image-22.png)


# Section 5 : Getting Started with Spring Boot

![alt text](image-54.png)
![alt text](image-55.png)




## 62

There are two key takeaways as far as I'm concerned.

Number one, spring boot startup projects are

convenient dependency descriptors.

To build a specific kind of application,

you might need set of dependencies.

For example, to build a web application

you need a set of dependencies.

All of these are predefined in startup projects.

Number two is the fact that Spring boot provides you

with a variety of startup projects.

Depending on your use case

you can choose the right startup project.

Now, is it sufficient if I have the right dependencies

in the class path?

Nope.

You need to also configure them.


## 63  Step 07 - Understanding Spring Boot Magic - Auto Configuration


everthing is auto configured in spring boot autoconfigure jar

## 64 dev tools


## 65. Step 09 - Get Production Ready with Spring Boot - 1 - Profiles


## 66
![alt text](image-56.png)
for the above it is recommended to use class
![alt text](image-57.png)

gen setters and getters
![alt text](image-58.png)

![alt text](image-59.png)

So a combination of configuration properties and profiles

in Spring Boot is very, very powerful.

It enables you to externalize all the configuration

that is needed for your application.

## 67
And typically if you are following an agile approach, then you might be doing multiple deployments

per day.






















































# Section 7 : Build Java Web Application with Spring Framework, Spring Boot and Hibernate

























































## 139 