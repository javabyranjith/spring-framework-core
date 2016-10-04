package jbr.springbeans.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

  ApplicationContext applicationContext;
  Person person1;
  Person person2;

  PersonMain() {
    applicationContext = new ClassPathXmlApplicationContext("beanscopes-beans.xml");
    person1 = (Person) applicationContext.getBean("person");
    System.out.println("Person 1 Object HashCode: " + person1.hashCode());

    person2 = (Person) applicationContext.getBean("person");
    System.out.println("Person 2 Object HashCode: " + person2.hashCode());

  }

  public static void main(String[] args) {
    PersonMain main = new PersonMain();
  }

}
