package jbr.spring.events.custom;

import org.springframework.context.ApplicationListener;

public class EmailEventListener implements ApplicationListener<EmailEvent> {

  @Override
  public void onApplicationEvent(EmailEvent emailEvent) {
    System.out.println("Inside EmailListener \n");
    System.out.println(emailEvent.toString());
  }

}
