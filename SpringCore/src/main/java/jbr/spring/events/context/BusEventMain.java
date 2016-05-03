package jbr.spring.events.context;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusEventMain {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-events-context.xml");
    // ContextRefreshedEvent called (during refresh or restarted)
    context.start(); // called ContextStartedEvent

    Bus bus = (Bus) context.getBean("bus");
    System.out.println(bus.getState());

    context.stop(); // called ContextStoppedEvent
    context.close();

    context.refresh();
    Bus bus1 = (Bus) context.getBean("bus");
    System.out.println(bus1.getState());
  }
}
