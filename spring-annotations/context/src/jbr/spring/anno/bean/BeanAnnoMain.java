package jbr.spring.anno.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnoMain {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("context-anno-beans.xml");
    Room room = (Room) ctx.getBean("room");
    System.out.println(room.getTable().getName());
  }

  public void printBeans(ApplicationContext ctx) {
    for (int i = 0; i < ctx.getBeanDefinitionCount(); i++) {
      System.out.println(ctx.getBeanDefinitionNames()[i]);
    }
  }
}
