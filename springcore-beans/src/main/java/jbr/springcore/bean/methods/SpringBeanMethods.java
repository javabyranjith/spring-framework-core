package jbr.springcore.bean.methods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcore.model.Bike;

/**
 * An example for Spring Bean Methods.
 * 
 * @author Ranjith Sekar
 *
 */
public class SpringBeanMethods {
  public static void main(String[] args) {
    AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("springbeans-methods.xml");
    Bike bike = (Bike) classPathContext.getBean("bike");
    bike.drive();
    classPathContext.registerShutdownHook();
  }
}
