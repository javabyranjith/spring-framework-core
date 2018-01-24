package jbr.springcontext.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class BusStartListener implements ApplicationListener<ContextStartedEvent> {

  @Override
  public void onApplicationEvent(ContextStartedEvent arg0) {
    System.out.println("Bus Started----->");
  }

}
