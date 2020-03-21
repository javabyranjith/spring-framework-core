package jbr.springcore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import jbr.springcore.model.Person;

public class SpringSingletonTest {
  ApplicationContext applicationContext1;
  ApplicationContext applicationContext2;
  Person person1;
  Person person2;

  @Before
  public void setUp() throws Exception {
    applicationContext1 = new FileSystemXmlApplicationContext("src/main/resources/springbeans-scopes.xml");
    applicationContext2 = new FileSystemXmlApplicationContext("src/main/resources/springbeans-scopes.xml");
  }

  @Test
  public void testAppContext1() {
    person1 = (Person) applicationContext1.getBean("person");
    person2 = (Person) applicationContext1.getBean("person");
    Assert.assertEquals(person1, person2);
    Assert.assertEquals(person1.getWeight(), person2.getWeight());
  }

  @Test
  public void testAppContext2() {
    person1 = (Person) applicationContext2.getBean("person");
    person2 = (Person) applicationContext2.getBean("person");
    Assert.assertEquals(person1, person2);
    Assert.assertEquals(person1.getHeight(), person2.getHeight());
  }

}
