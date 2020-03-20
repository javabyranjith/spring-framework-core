package jbr.springintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import jbr.springintro.model.Person;

/**
 * An example program for Spring Framework Core.
 * 
 * @author Ranjith Sekar
 *
 */
public class SpringHelloWorld {

	public static void main(String[] args) {
		ApplicationContext appContext = new FileSystemXmlApplicationContext("config/applicationContext.xml");
		Person person = (Person) appContext.getBean("person");
		System.out.println("Person Name: " + person.getName());
	}
}
