package jbr.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import jbr.spring.core.model.Car;

/**
 * 1) Requires spring-beans libs. 2) Does not support the Annotation based
 * dependency Injection. 3) Doesn't Support I18N 4) By default its support Lazy
 * loading 5) it doesn't allow configure to multiple configuration files.
 *
 */
public class BeanFactoryContainer {
  public static void main(String[] args) {

    BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-core.xml"));
   System.out.println("is car bean exists? : " + beanFactory.containsBean("car"));
    Car car = (Car) beanFactory.getBean("car");
    System.out.println("Price: " + car.getPrice());
    System.out.println("Engine Type: " + car.getEngine().getType());
  }
}
