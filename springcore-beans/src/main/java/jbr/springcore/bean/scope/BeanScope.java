package jbr.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcore.model.PersonVO;

public class BeanScope {

  public static void main(String[] args) {
    ApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-beans.xml");
    PersonVO person1 = (PersonVO) classPathContext.getBean("person");
    person1.setName("Ranjith");
    System.out.println("PersonVO1 Name: " + person1.getName());

    PersonVO person2 = (PersonVO) classPathContext.getBean("person");
    //person2.setName("Sekar");
    System.out.println("PersonVO2 Name: " + person2.getName());

  }
}
