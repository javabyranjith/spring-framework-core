package jbr.spring.events.custom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailEventMain {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-events-custom.xml");

    EmailEvent emailEvent = new EmailEvent(context, "Ranjith", "Sekar", "Test Email");
    context.publishEvent(emailEvent);

    context.start();
    context.stop();
  }
}
