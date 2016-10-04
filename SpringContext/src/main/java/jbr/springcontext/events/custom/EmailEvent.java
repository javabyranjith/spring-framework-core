package jbr.springcontext.events.custom;

import org.springframework.context.ApplicationEvent;

public class EmailEvent extends ApplicationEvent {
  private static final long serialVersionUID = 1L;

  final String message;
  final String sender;
  final String receiver;

  public String getMessage() {
    return message;
  }

  public String getSender() {
    return sender;
  }

  public String getReceiver() {
    return receiver;
  }

  public EmailEvent(Object source, final String sender, final String receiver, final String message) {
    super(source);
    this.sender = sender;
    this.receiver = receiver;
    this.message = message;
  }

  @Override
  public String toString() {
    return "SENDER : " + this.sender + "\nRECEIVER : " + this.receiver + "\nMESSAGE : " + this.message;
  }
}
