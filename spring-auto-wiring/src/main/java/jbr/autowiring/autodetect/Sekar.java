package jbr.autowiring.autodetect;

import jbr.autowiring.Education;

public class Sekar {
  private Education education;

  public Education getEducation() {
    return education;
  }

  public void setEducation(Education education) {
    this.education = education;
  }

  @Override
  public String toString() {
    return "by type";
  }
}
