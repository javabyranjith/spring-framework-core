package jbr.spring.anno.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class BeanAnnoMainComponent {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(BeanAnnoMainComponent.class);
    ctx.refresh();

    Room room = (Room) ctx.getBean("room");
    System.out.println(room.getChair().getName());
    ctx.close();
  }
}
