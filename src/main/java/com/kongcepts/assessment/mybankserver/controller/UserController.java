package com.kongcepts.assessment.mybankserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kongcepts.assessment.mybankserver.model.EmployeeDTO;
import com.kongcepts.assessment.mybankserver.model.JwtResponse;
import com.kongcepts.assessment.mybankserver.service.EmployeeService;

/**
 * @author Sakila Dissanayake
 *
 */
@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * This method returns the all employees
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeDTO>> getAllEmployeesDatails() {
		return ResponseEntity.ok().body(employeeService.getAllEmployeesDatails());		
	}

}
