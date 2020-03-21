package jbr.springcore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jbr.springcore.bean.scope.JavaSingleton;

public class JavaSingletonTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void test() {
    Assert.assertEquals(JavaSingleton.getInstance().hashCode(), JavaSingleton.getInstance().hashCode());
  }

}
