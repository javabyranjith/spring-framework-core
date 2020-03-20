package jbr.spring.events.custom;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailAppContextListener implements ApplicationListener<ApplicationEvent> {

  @Override
  public void onApplicationEvent(ApplicationEvent appEvent) {
    System.out.println("Email Listener - Event : " + appEvent.getClass());
  }

}
