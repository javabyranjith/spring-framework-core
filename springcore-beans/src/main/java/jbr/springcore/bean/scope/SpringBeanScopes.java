package jbr.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcore.model.Person;

/**
 * An example program to test Spring Singleton.
 * 
 * @author Ranjith Sekar
 *
 */
public class SpringBeanScopes {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbeans-scopes.xml");
    Person person1 = (Person) applicationContext.getBean("person");
    System.out.println("Person1 Middle Name: " + person1.getName().getMiddleName());
    System.out.println("Person 1 Object HashCode: " + person1.hashCode());
    System.out.println("person1 height: " + person1.getHeight());

    Person person2 = (Person) applicationContext.getBean("person");
    System.out.println("\nPerson 2 Object HashCode: " + person2.hashCode());
    System.out.println("person2 height: " + person2.getHeight());
    System.out.println("person2 city: " + person2.getAddress().getCity());

    System.out.println("\nAre both objects same ? " + (person1 == person2));
  }
}
