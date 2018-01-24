package jbr.autowiring.constructor;

import jbr.autowiring.Address;

public class Person {

  private Address address;

  public Person(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "streeName: " + address.getStreeName() + "  doorNo: " + address.getDoorNo();
  }
}
