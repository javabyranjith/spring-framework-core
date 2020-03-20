package jbr.springcore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import jbr.spring.autowiring.constructor.Person;

public class AutoWiringConstructorTest {

  ApplicationContext applicationContext;
  Person personByConstructorWithoutAutowiring;
  Person personByConstructor;

  @Before
  public void init() throws Exception {
    applicationContext = new FileSystemXmlApplicationContext("config/autowiring-beans.xml");
    personByConstructorWithoutAutowiring = (Person) applicationContext.getBean("personByConstructorWithoutAutowiring");
    personByConstructor = (Person) applicationContext.getBean("personByConstructor");
  }

  @Test
  public void testAddress() {
    System.out.println(personByConstructorWithoutAutowiring);
    System.out.println(personByConstructor);
    Assert.assertEquals(personByConstructorWithoutAutowiring.toString(), personByConstructor.toString());
  }

}
