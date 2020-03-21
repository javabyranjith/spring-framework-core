package jbr.springcore.model;

import org.springframework.beans.factory.BeanNameAware;

public class Train implements BeanNameAware {
  private String trainName;

  @Override
  public void setBeanName(String beanName) {
    System.out.println(beanName + " - bean has been created");
  }

  public Train(String trainName) {
    this.trainName = trainName;
  }

  public String getTrainName() {
    return trainName;
  }

  public void init() {
    System.out.println("inside Train.init()");
  }

}
