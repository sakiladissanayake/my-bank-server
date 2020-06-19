package com.kongcepts.assessment.mybankserver.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kongcepts.assessment.mybankserver.model.Employee;

/**
 * @author Sakila Dissanayake
 *
 */
@Repository
public interface UserDao extends JpaRepository<Employee, Integer> {

	/**
	 * This method find the user by email
	 * 
	 * @param empEmail
	 * @return
	 */
	@Query(nativeQuery = true, value = "SELECT * FROM employee WHERE employee.emp_email = :emp_email")
	Employee findUserByEmail(@Param("emp_email") String empEmail);

	/**
	 * This method return the all records in employee table
	 * 
	 * @return
	 */
	@Query("SELECT e FROM Employee e")
	List<Employee> getAllData();

}