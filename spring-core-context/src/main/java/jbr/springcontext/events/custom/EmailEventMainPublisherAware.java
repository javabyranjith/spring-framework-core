package jbr.springcontext.events.custom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailEventMainPublisherAware {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-events-custom.xml");

    EmailEventPublisher emailEventPublisher = (EmailEventPublisher) context.getBean("emailEventPublisher");
    emailEventPublisher.publish();

    context.start();
    context.stop();
    context.close();
  }
}
