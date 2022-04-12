package in.ashokit.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {
public Car() {
	System.out.println("Car class:: Constructor");
}


//i want to create my class object , not By Ioc. and i want IOC just call my method
@Bean            
public Car getCar() {
	Car c=new Car();
	return c;

}



}
