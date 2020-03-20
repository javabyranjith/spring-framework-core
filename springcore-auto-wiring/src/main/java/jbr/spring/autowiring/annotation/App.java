package jbr.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
  @Autowired
  Field field;

  ApplicationContext applicationContext;

  public App() {
    applicationContext = new FileSystemXmlApplicationContext("config/autowiring-annotation-beans.xml");
  }

  public static void main(String[] args) {
    App ap = new App();
    ap.test();
  }

  public void test() {
    System.out.println(applicationContext.containsBean("field"));
    System.out.println(field.toString());
  }
}
