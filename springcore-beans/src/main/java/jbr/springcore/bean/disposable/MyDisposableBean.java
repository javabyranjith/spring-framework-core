package jbr.springcore.bean.disposable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyDisposableBean implements InitializingBean, DisposableBean {

  @Override
  public void destroy() throws Exception {
    System.out.println("MyDisposableBean: in destory");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("MyDisposableBean: in afterPropertiesSet");
  }

  private String greetings;

  public String getGreetings() {
    return greetings;
  }

  public void setGreetings(String greetings) {
    this.greetings = greetings;
  }

}
