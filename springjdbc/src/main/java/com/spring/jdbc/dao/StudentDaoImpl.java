package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	public JdbcTemplate jdbcTemplete;

	@Override
	public Student getStudent(Long studentId) {
		String sql = "Select * from student where id=?";
		return (Student) this.jdbcTemplete.queryForObject(sql,

				new RowMapper() {

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						Student student = new Student();
						student.setId(rs.getLong(1));
						student.setFirstName(rs.getString(2));
						student.setLastName(rs.getString(3));
						student.setEmail(rs.getString(4));
						student.setDateOfBirth(rs.getDate(5).toLocalDate());
						student.setEnrollmentDate(rs.getDate(6).toLocalDate());
						return student;
					}

				}, studentId);
	}

	@Override
	public List<Student> getStudents() {
		String sql = "Select * from student";
		return this.jdbcTemplete.query(sql, new RowMapper() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getLong(1));
				student.setFirstName(rs.getString(2));
				student.setLastName(rs.getString(3));
				student.setEmail(rs.getString(4));
				student.setDateOfBirth(rs.getDate(5).toLocalDate());
				student.setEnrollmentDate(rs.getDate(6).toLocalDate());
				return student;
			}

		});
	}

	@Override
	public int insert(Student student) {
		String sql = "INSERT INTO student (first_name, last_name, email, date_of_birth) " + "VALUES (?, ?, ?, ?)";
		return this.jdbcTemplete.update(sql, student.getFirstName(), student.getLastName(), student.getEmail(),
				student.getDateOfBirth());
	}

}
