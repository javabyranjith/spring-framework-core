package jbr.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import jbr.spring.core.model.Car;

/**
 * 
 * 1) Requires spring-context libs. 2) Support Annotation based dependency
 * Injection.-@Autowired, @PreDestroy 3) Support I18N 4) its By default support
 * Aggressive loading. 5) it allow to configure multiple configuration files.
 */
public class ApplicationContextContainer {

  public static void main(String[] args) {

    
    // Loading Beans - 1 (Class Path)
    ApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-core.xml");
    Car car = (Car) classPathContext.getBean("car");
    System.out.println("==ClassPathXmlApplicationContext==");
    System.out.println("Price: " + car.getPrice());
    System.out.println("Engine Type: " + car.getEngine().getType());

    // Loading Beans - 2 (File System)
    ApplicationContext fileSystemContext = new FileSystemXmlApplicationContext("/config/spring-core.xml");
    Car car1 = (Car) fileSystemContext.getBean("car");
    System.out.println("==FileSystemXmlApplicationContext==");
    System.out.println("Price: " + car1.getPrice());
    System.out.println("Engine Type: " + car1.getEngine().getType());

    // Loading Beans - 3 (Web App Xml)
    // ApplicationContext webContext = new WebXmlApplicationContext
  }

}
