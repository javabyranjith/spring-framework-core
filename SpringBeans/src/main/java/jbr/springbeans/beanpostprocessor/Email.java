package jbr.springbeans.beanpostprocessor;

public class Email {

  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void init() {
    System.out.println("Email: Init..");
  }

  public void destroy() {
    System.out.println("Email: destroy...");
  }

}
