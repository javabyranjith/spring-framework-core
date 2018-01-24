package jbr.springbeans.model;

public class Person {

  public void initialize(){
    System.out.println("this is init method in Person..");
  }
  private String name;
  private int age;
  private String address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void complete(){
    System.out.println("this is destroy method in Person...");
  }
  
}
