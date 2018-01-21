package jbr.springbeans.aware;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.Train;

public class BeanNameAwareMain {

  public static void main(String[] args) {
    AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("springbeans-aware.xml");
    Train train = (Train) classPathContext.getBean("train");
    System.out.println("Train Name: " + train.getTrainName());

    classPathContext.close();
  }
}
