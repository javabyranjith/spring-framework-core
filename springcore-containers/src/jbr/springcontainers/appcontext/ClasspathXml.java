package jbr.springcontainers.appcontext;

  import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcontainers.model.Car;
import jbr.springcontainers.model.Person;

/**
 * An example program for loading beans using Spring
 * ClassPathXmlApplicationContext.
 * 
 * @author Ranjith Sekar
 *
 */
public class ClasspathXml {
  public static void main(String[] args) {
    ApplicationContext appContext = new ClassPathXmlApplicationContext(
        new String[] { "container-appcontext-classpath.xml", "container-appcontext-classpath2.xml" });
    Person person = (Person) appContext.getBean("person");
    System.out.println("Name: " + person.getName());
    
    Car car =(Car) appContext.getBean("car");
    System.out.println("Car Color: "+ car.getColor());
  }
}
