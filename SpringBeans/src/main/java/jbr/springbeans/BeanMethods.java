package jbr.springbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.Bike;

public class BeanMethods {

  public static void main(String[] args) {
    AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-beans.xml");
    Bike bike = (Bike) classPathContext.getBean("bike");
    bike.drive();
    classPathContext.registerShutdownHook();
  }
}
