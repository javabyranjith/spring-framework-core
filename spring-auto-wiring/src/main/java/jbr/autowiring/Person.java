package jbr.autowiring;

public class Person {
  private Address address;
  private Education education;

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Education getEducation() {
    return education;
  }

  public void setEducation(Education education) {
    this.education = education;
  }

}
