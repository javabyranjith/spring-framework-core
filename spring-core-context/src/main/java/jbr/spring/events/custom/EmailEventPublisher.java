package jbr.spring.events.custom;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EmailEventPublisher implements ApplicationEventPublisherAware {
  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher appEventPublisher) {
    this.applicationEventPublisher = appEventPublisher;
  }

  public void publish() {
    System.out.println("Inside EmailEventPublisher\n");
    EmailEvent emailEvent = new EmailEvent(this, "Kabilan", "Ranjith", "Hello dear!!");
    applicationEventPublisher.publishEvent(emailEvent);
    System.out.println("\n");
  }
}
