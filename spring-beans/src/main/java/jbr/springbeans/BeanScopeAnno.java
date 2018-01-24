package jbr.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.PersonAnno;

public class BeanScopeAnno {

  public static void main(String[] args) {
    ApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-beans.xml");
    PersonAnno person1 = (PersonAnno) classPathContext.getBean("personAnno");
    person1.setName("Ranjith");
    System.out.println("Person1 Name: " + person1.getName());

    PersonAnno person2 = (PersonAnno) classPathContext.getBean("personAnno");
    System.out.println("Person2 Name: " + person2.getName());
  }
}
