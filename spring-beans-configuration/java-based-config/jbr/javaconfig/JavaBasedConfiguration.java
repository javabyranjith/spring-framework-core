package jbr.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import jbr.javaconfig.model.Car;
import jbr.javaconfig.model.CarConfig;

public class JavaBasedConfiguration {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		Car car = context.getBean(Car.class);
		car.setName("Maruti");
		System.out.println("Car Name: " + car.getName());
		System.out.println("Wheel Size: " + car.getWheel().getSize());

		context.close();
	}

}
