package jbr.springbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.Car;

public class BeanInitDestroy {

  public static void main(String[] args) {
    AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-beans.xml");
    Car car = (Car) classPathContext.getBean("car");
    car.drive();
    classPathContext.registerShutdownHook();
  }
}
