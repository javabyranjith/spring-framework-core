package jbr.spring.autowiring.autodetect;

import jbr.spring.autowiring.Education;

public class Ranjith {

  private Education education;

  public Ranjith(Education education) {
    this.education = education;
  }

  public Education getEducation() {
    return education;
  }

  public void setEducation(Education education) {
    this.education = education;
  }

  @Override
  public String toString() {
    return "by constructor";
  }

}
