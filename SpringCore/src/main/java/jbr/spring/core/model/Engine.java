package jbr.spring.core.model;

public class Engine {

  private String capacity;
  private String type;

  public Engine(String capacity, String type) {
    this.capacity = capacity;
    this.type = type;
  }

  public String getCapacity() {
    return capacity;
  }

  public String getType() {
    return type;
  }

}
