package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="model")

//@ComponentScan
public class AppConfig {

	
@Bean
public EmployeeService employee()
{
	EmployeeService e= new EmployeeService();
	e.setAdd(add());
	return e;
}
//
//
@Bean
public AddressService add()
{
	return new AddressService();
}

	
//	@Bean
//	public EmployeeService employeeService1() {
//		return new EmployeeService();
//	}
//
//	@Bean
//	public EmployeeService employeeService2() {
//		return new EmployeeService();
//	}
}
