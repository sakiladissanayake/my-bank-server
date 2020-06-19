package com.kongcepts.assessment.mybankserver.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Sakila Dissanayake
 *
 */
@Entity
@Table(name = "Employee")
@EntityListeners(AuditingEntityListener.class)
public class Employee {

	@Id
	@Column(name = "emp_id", nullable = false)
	private int empId;

	@Column(name = "emp_name", nullable = false)
	private String empName;

	@Column(name = "emp_email", nullable = false)
	private String empEmail;

	@Column(name = "emp_photo", nullable = false)
	private String empPhoto;

	@Column(name = "emp_address", nullable = false)
	private String empAddress;

	@Column(name = "emp_password", nullable = false)
	private String empPassword;

	@JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Branch branch;

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

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
