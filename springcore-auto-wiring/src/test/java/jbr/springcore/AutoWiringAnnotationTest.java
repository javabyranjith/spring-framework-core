package jbr.springcore;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.spring.autowiring.annotation.Field;

@ContextConfiguration(locations = { "classpath:*/beans-autowiring-annotation.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AutoWiringAnnotationTest {

  @Autowired
  Field field;

  @Test
  public void testAddress() {
    Assert.assertEquals("Gandhi Street", field.toString());
  }

}