package jbr.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.annotation.model.Student;

public class AnnotationBasedConfig {
	public static void main(String[] args) {
		AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("annotation-based-beans.xml");
		Student student = (Student) classPathContext.getBean("student");
		System.out.println("Student Qualification: " + student.getEducation().getQualification());
		classPathContext.close();
	}
}
