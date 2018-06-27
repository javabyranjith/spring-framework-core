package jbr.spring.anno.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TableMain {

  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:stereotype-anno-beans.xml");

    Table table = (Table) ctx.getBean("tableBean");
    System.out.println("Table :" + table.getName());

    Chair chair = (Chair) ctx.getBean("chair");
    System.out.println("Chair :" + chair.getName());
  }
}
