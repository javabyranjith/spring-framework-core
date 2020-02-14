package jbr.spring.collections.xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.spring.collections.model.Mobile;

public class AppXmlMail {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-core-collections-beans.xml");
    Mobile mobile = (Mobile) context.getBean("mobile");
    mobile.printMobileList();
    mobile.printPriceMap();
    mobile.printModelSet();
  }
}