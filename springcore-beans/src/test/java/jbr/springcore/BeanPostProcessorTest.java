package jbr.springcore;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcore.bean.postprocessor.Email;

public class BeanPostProcessorTest {
  AbstractApplicationContext applicationContext;
  Email email;

  @Before
  public void setUp() throws Exception {
    applicationContext = new ClassPathXmlApplicationContext("springbeans-postprocessor.xml");
    email = (Email) applicationContext.getBean("email");
  }

  @Test
  public void test() {
    Assert.assertEquals("Dear Sekar, You have got a Email!!!", email.getMessage());
  }

  @After
  public void close() throws Exception {
    applicationContext.close();
  }

}
