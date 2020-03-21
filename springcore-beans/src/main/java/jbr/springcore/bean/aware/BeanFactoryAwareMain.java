package jbr.springcore.bean.aware;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcore.model.Cycle;

public class BeanFactoryAwareMain {

  public static void main(String[] args) {
    AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("springbeans-aware.xml");
    Cycle myCycle = (Cycle) classPathContext.getBean("cycle");

    System.out.println("Cycle Model: " + myCycle.getCycleModel());

    classPathContext.close();
  }
}
