package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		// Autowiring doesn't work with static fields
		// Spring's @Autowired does not work with static fields because static fields
		// are not managed by the Spring container.
		// Get the StudentDao bean from the context
		StudentDao studentDao = context.getBean(StudentDao.class);

		// Student student = new Student("Iram", "Anwar", "xy7888@gmail.com",
		// LocalDate.of(1999, 5, 15));
		// studentDao.insert(student);
		Student student = studentDao.getStudent(1L);
		System.out.println(student);
		List<Student> students = studentDao.getStudents();
		students.forEach(s -> System.out.println(s));
		// System.out.println("Inserted");

	}

}
