package jbr.springbeans.model;

/**
 * Address Model Object.
 * 
 * @author Ranjith Sekar
 *
 */
public class Address {

  private String doorNo;
  private String street;
  private String city;
  private String country;

  public String getDoorNo() {
    return doorNo;
  }

  public void setDoorNo(String doorNo) {
    this.doorNo = doorNo;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
