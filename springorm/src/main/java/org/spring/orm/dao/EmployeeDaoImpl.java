package org.spring.orm.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.spring.orm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void deleteEmployee(int id) {
		Employee employee = getEmployeeById(id);
		if (employee != null)
			this.sessionFactory.getCurrentSession().remove(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return this.sessionFactory.getCurrentSession().createQuery("from Employee", Employee.class).list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return this.sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.sessionFactory.getCurrentSession().persist(employee);
	}
}
