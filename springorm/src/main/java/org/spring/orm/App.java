package org.spring.orm;

import org.spring.orm.dao.EmployeeDao;
import org.spring.orm.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
		Employee emp = new Employee("Iram", 26, "CSE", 10000000);
		employeeDao.saveEmployee(emp);
	}
}
