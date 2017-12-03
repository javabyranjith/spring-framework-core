package jbr.springbeans.aware;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.Cycle;

public class BeanFactoryAware {

  public static void main(String[] args) {
    AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("springbeans-aware.xml");
    Cycle myCycle = (Cycle) classPathContext.getBean("cycle");

    System.out.println("Cycle Model: " + myCycle.getCycleModel());

    classPathContext.close();
  }
}
