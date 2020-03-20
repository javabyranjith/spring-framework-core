package jbr.spring.appcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import jbr.spring.model.Person;

/**
 * An example program for loading beans using Spring FileSystemXmlApplicationContext.
 * 
 * @author Ranjith Sekar
 *
 */
public class FileSystemXml {

	public static void main(String[] args) {
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("C:/Users/ranjiths/OneDrive - Virtusa/od-ranjiths/jbr/workshop/ws/zzz/fileSystemXml.xml");
		ApplicationContext appContext = new FileSystemXmlApplicationContext("/temp/container-appcontext-filesystem.xml");
		Person person = (Person) appContext.getBean("person");
		System.out.println("Name: " + person.getName());
	}
}
