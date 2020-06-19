package com.kongcepts.assessment.mybankserver.model;

/**
 * @author Sakila Dissanayake
 *
 */
public class EmployeeDTO {

	private int empId;
	private String empName;
	private String empEmail;
	private String empPhoto;
	private String branchName;
	private String bankName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhoto() {
		return empPhoto;
	}

	public void setEmpPhoto(String empPhoto) {
		this.empPhoto = empPhoto;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
