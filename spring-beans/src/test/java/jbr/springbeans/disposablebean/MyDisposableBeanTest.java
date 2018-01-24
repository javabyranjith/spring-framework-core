package jbr.springbeans.disposablebean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyDisposableBeanTest {
  AbstractApplicationContext applicationContext;
  MyDisposableBean myDisposableBean;

  @Before
  public void setUp() throws Exception {
    applicationContext = new FileSystemXmlApplicationContext("config/springbeans-disposablebean.xml");
    myDisposableBean = (MyDisposableBean) applicationContext.getBean("disposableBean");
  }

  @Test
  public void test() {
    Assert.assertEquals("Good Morning!!!", myDisposableBean.getGreetings());
  }

  @After
  public void close() throws Exception {
    applicationContext.close();
  }
}
