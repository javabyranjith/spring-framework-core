package jbr.spring.beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.spring.beans.model.Car;

public class BeanInitDestroy {

  public static void main(String[] args) {
    AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-beans.xml");
    Car car = (Car) classPathContext.getBean("car");
    car.drive();
    classPathContext.registerShutdownHook();
  }
}
