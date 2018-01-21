package jbr.springbeans.model;

/**
 * Person Model Object.
 * 
 * @author Ranjith Sekar
 *
 */
public class Person {

  private Name name;
  private String height;
  private String weight;
  private Address address;

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

}
