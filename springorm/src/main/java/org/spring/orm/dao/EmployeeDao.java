package org.spring.orm.dao;

import java.util.List;

import org.spring.orm.entity.Employee;

public interface EmployeeDao {

	void deleteEmployee(int id);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	void saveEmployee(Employee employee);

}
