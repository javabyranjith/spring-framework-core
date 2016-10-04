package jbr.springbeans.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSingleton {

  ApplicationContext applicationContext1;
  ApplicationContext applicationContext2;
  Person person1;
  Person person2;

  SpringSingleton() {

    applicationContext1 = new ClassPathXmlApplicationContext("beanscopes-beans.xml");
    person1 = (Person) applicationContext1.getBean("person");
    System.out.println("applicationContext1 Person1 Object HashCode: " + person1.hashCode());
    person2 = (Person) applicationContext1.getBean("person");
    System.out.println("applicationContext1 Person2 Object HashCode: " + person2.hashCode());

    applicationContext2 = new ClassPathXmlApplicationContext("beanscopes-beans.xml");
    person1 = (Person) applicationContext2.getBean("person");
    System.out.println("applicationContext2 Person1 Object HashCode: " + person1.hashCode());
    person2 = (Person) applicationContext2.getBean("person");
    System.out.println("applicationContext2 Person2 Object HashCode: " + person2.hashCode());

  }

  public static void main(String[] args) {
    SpringSingleton main = new SpringSingleton();
  }

}
