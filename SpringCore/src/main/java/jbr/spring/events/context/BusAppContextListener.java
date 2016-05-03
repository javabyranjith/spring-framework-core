package jbr.spring.events.context;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Listens the events thats are published in the context.
 *
 */
public class BusAppContextListener implements ApplicationListener<ApplicationEvent> {

  @Override
  public void onApplicationEvent(ApplicationEvent appEvent) {
    System.out.println("Bus Listener - Event : " + appEvent.getClass());
  }

}
