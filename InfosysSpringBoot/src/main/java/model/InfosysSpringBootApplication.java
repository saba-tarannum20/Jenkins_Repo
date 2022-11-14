package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class InfosysSpringBootApplication {

	public static void main(String[] args) {

//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		EmployeeService emp1 = (EmployeeService) context.getBean("employeeService1");
//		EmployeeService emp2 = (EmployeeService) context.getBean("employeeService2");
	//	EmployeeService emp = context.getBean("employee");

		//emp.display();
		
	//	System.out.println(""+emp1+ " "+ emp2+ " ");
		
		
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService emp=context.getBean(EmployeeService.class);
		emp.display();
		
	}

}
