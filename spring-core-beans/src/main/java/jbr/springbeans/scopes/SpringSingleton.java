package jbr.springbeans.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.Person;

/**
 * An example program for testing Spring Singleton. Singleton maintained for
 * each application context.
 * 
 * @author Ranjith Sekar
 *
 */
public class SpringSingleton {

  public static void main(String[] args) {
    ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("springbeans-beanscopes.xml");
    Person person1 = (Person) applicationContext1.getBean("person");
    System.out.println("applicationContext1 Person1 Object HashCode: " + person1.hashCode());
    Person person2 = (Person) applicationContext1.getBean("person");
    System.out.println("applicationContext1 Person2 Object HashCode: " + person2.hashCode());

    ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("springbeans-beanscopes.xml");
    person1 = (Person) applicationContext2.getBean("person");
    System.out.println("applicationContext2 Person1 Object HashCode: " + person1.hashCode());
    person2 = (Person) applicationContext2.getBean("person");
    System.out.println("applicationContext2 Person2 Object HashCode: " + person2.hashCode());
  }

}
