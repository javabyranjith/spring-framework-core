package jbr.springcore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import jbr.spring.autowiring.Person;

public class AutoWiringTest {

  ApplicationContext applicationContext;
  Person personWithoutAutowiring;
  Person personByName;
  Person personByType;

  @Before
  public void init() throws Exception {
    applicationContext = new FileSystemXmlApplicationContext("src/main/resources/beans-autowiring.xml");
    personWithoutAutowiring = (Person) applicationContext.getBean("personWithoutAutowiring");
    personByName = (Person) applicationContext.getBean("personByName");
    personByType = (Person) applicationContext.getBean("personByType");
  }

  @Test
  public void testAddress() {
    Assert.assertEquals("Gandhi Street", personWithoutAutowiring.getAddress().getStreeName());
    Assert.assertEquals("Gandhi Street", personByName.getAddress().getStreeName());
    Assert.assertEquals("Gandhi Street", personByType.getAddress().getStreeName());
  }

  @Test
  public void testQualification() {
    Assert.assertEquals("M.Tech", personWithoutAutowiring.getEducation().getQualification());
    Assert.assertEquals("M.Tech", personByName.getEducation().getQualification());
    Assert.assertEquals("M.Tech", personByType.getEducation().getQualification());
  }

}
