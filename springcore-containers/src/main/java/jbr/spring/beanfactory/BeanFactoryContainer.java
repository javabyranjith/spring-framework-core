package jbr.spring.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import jbr.spring.model.Person;

/**
 * An example program for loading beans using Spring BeanFactory.
 * 
 * @author Ranjith Sekar
 *
 */
public class BeanFactoryContainer {
  public static void main(String[] args) {
    BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("container-beanfactory.xml"));
    System.out.println("is person bean exists? : " + beanFactory.containsBean("person"));
    Person person = (Person) beanFactory.getBean("person");
    System.out.println("Name: " + person.getName());
  }
}
