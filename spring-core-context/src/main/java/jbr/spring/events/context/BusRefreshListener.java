package jbr.spring.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class BusRefreshListener implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent arg0) {
    System.out.println("Refresh or Restart");
  }

}
