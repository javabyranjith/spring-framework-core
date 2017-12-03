package jbr.springbeans.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean {

  @Override
  public void destroy() throws Exception {
    System.out.println("stop car <----------");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("start car");
  }

  public void drive() {
    System.out.println("drive car --------->");
  }
}
