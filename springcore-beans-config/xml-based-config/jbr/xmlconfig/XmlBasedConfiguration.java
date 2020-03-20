package jbr.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.xmlconfig.model.Person;

public class XmlBasedConfiguration {
	public static void main(String[] args) {
		AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("xml-based-beans.xml");
		Person person = (Person) classPathContext.getBean("person");
		System.out.println("Name: " + person.getName());
		classPathContext.close();
	}
}
