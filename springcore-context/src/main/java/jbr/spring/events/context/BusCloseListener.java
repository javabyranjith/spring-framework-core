package jbr.spring.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class BusCloseListener implements ApplicationListener<ContextClosedEvent> {

  @Override
  public void onApplicationEvent(ContextClosedEvent arg0) {
    System.out.println("Bus parked....");
  }

}
