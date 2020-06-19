package com.kongcepts.assessment.mybankserver.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongcepts.assessment.mybankserver.dao.UserDao;
import com.kongcepts.assessment.mybankserver.model.Employee;
import com.kongcepts.assessment.mybankserver.model.EmployeeDTO;

/**
 * @author Sakila Dissanayake
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private UserDao userDao;

	/**
	 * This method get the employee list and generate the output according to the
	 * user needs.
	 * 
	 * @return - List of EmployeeDTO
	 */
	public List<EmployeeDTO> getAllEmployeesDatails() {

		List<Employee> employeeList = userDao.getAllData();
		List<EmployeeDTO> employeeDataList = new ArrayList<EmployeeDTO>();

		if (!employeeList.isEmpty()) {
			for (Employee employee : employeeList) {
				EmployeeDTO employeeObject = new EmployeeDTO();

				employeeObject.setEmpId(employee.getEmpId());
				employeeObject.setEmpName(employee.getEmpName());
				employeeObject.setEmpEmail(employee.getEmpEmail());
				employeeObject.setEmpPhoto(employee.getEmpPhoto());
				employeeObject.setBranchName(employee.getBranch().getBranchName());
				employeeObject.setBankName(employee.getBranch().getBank().getBankName());

				employeeDataList.add(employeeObject);
			}

			return employeeDataList;
		}

		return employeeDataList;

	}

}
