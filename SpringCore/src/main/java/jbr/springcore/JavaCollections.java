package jbr.springcore;

import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springcore.model.CollectionBean;

public class JavaCollections {

  public static void main(String[] args) {
    ApplicationContext classPathContext = new ClassPathXmlApplicationContext("spring-core.xml");
    CollectionBean collBean = (CollectionBean) classPathContext.getBean("collection");

    System.out.println("==LIST VALUES");
    for (String str : collBean.getList()) {
      System.out.println(str);
    }

    System.out.println("\n==MAP VALUES");
    for (Entry<String, String> entry : collBean.getMap().entrySet()) {
      System.out.println("KEY: " + entry.getKey() + " >> VALUE: " + entry.getValue());
    }

    System.out.println("\n==SET VALUES");
    for (String str : collBean.getSet()) {
      System.out.println(str);
    }

    System.out.println("\n==PROPERTIES VALUES");
    Properties prop = collBean.getProps();
    for (Object key : prop.keySet()) {
      System.out.println("KEY: " + key.toString() + " >> VALUE: " + prop.getProperty(key.toString()));
    }

  }
}
