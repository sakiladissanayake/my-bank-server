package com.kongcepts.assessment.mybankserver.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Sakila Dissanayake
 *
 */
@Entity
@Table(name = "Branch")
@EntityListeners(AuditingEntityListener.class)
public class Branch {

	@Id
	@Column(name = "branch_id", nullable = false)
	private int branchId;

	@Column(name = "branch_name", nullable = false)
	private String branchName;

	@Column(name = "branch_address", nullable = false)
	private String branchAddress;

	@JoinColumn(name = "bank_id", referencedColumnName = "bank_id")
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Bank bank;

	@OneToMany(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private List<Employee> employees;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
