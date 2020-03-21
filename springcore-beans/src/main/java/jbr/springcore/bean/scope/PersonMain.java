package jbr.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcore.model.PersonVO;

public class PersonMain {

  ApplicationContext applicationContext;
  PersonVO person1;
  PersonVO person2;

  PersonMain() {
    applicationContext = new ClassPathXmlApplicationContext("beanscopes-beans.xml");
    person1 = (PersonVO) applicationContext.getBean("person");
    System.out.println("Person 1 Object HashCode: " + person1.hashCode());

    person2 = (PersonVO) applicationContext.getBean("person");
    System.out.println("Person 2 Object HashCode: " + person2.hashCode());

  }

  public static void main(String[] args) {
    PersonMain main = new PersonMain();
  }

}
