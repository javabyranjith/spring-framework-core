package jbr.spring.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class BusStopListener implements ApplicationListener<ContextStoppedEvent> {

  @Override
  public void onApplicationEvent(ContextStoppedEvent arg0) {
    System.out.println("Bus Stopped<-----");
  }

}
