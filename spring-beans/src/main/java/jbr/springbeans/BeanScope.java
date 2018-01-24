package jbr.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.Person;

public class BeanScope {

  public static void main(String[] args) {
    ApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-beans.xml");
    Person person1 = (Person) classPathContext.getBean("person");
    person1.setName("Ranjith");
    System.out.println("Person1 Name: " + person1.getName());

    Person person2 = (Person) classPathContext.getBean("person");
    //person2.setName("Sekar");
    System.out.println("Person2 Name: " + person2.getName());

  }
}
