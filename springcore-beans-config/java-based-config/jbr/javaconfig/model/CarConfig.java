package jbr.javaconfig.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarConfig {

	@Bean()
	@Scope(scopeName = "prototype")
	public Car car() {
		return new Car(wheel());
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Wheel wheel() {
		return new Wheel();
	}
}
