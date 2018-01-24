package jbr.javaconfig.model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {

	private String name;
	private Wheel wheel;

	public Car(Wheel wheel) {
		this.wheel = wheel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public String getName() {
		return name;
	}

	public Wheel getWheel() {
		return wheel;
	}

}
