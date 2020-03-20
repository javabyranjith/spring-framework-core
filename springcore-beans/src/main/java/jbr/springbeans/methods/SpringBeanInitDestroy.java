package jbr.springbeans.methods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jbr.springbeans.model.Car;

/**
 * An example for Spring Init and Destory methods.
 * 
 * @author Ranjith Sekar
 *
 */
public class SpringBeanInitDestroy {
	public static void main(String[] args) {
		AbstractApplicationContext classPathContext = new ClassPathXmlApplicationContext("springbeans-methods.xml");
		Car car = (Car) classPathContext.getBean("car");
		car.drive();
		classPathContext.registerShutdownHook();
	}
}
