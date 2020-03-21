package jbr.springcore.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Cycle implements BeanFactoryAware {
  private String cycleModel;

  public Cycle(String cycleModel) {
    this.cycleModel = cycleModel;
  }

  public String getCycleModel() {
    return cycleModel;
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    /*
     * Cycle cycle = (Cycle) beanFactory.getBean("cycle");
     * System.out.println(cycle.getCycleModel());
     */
    Train train = (Train) beanFactory.getBean("train");
    System.out.println(train.getTrainName());

  }

  public void init() {
    System.out.println("inside Cycle.init()");
  }

}
