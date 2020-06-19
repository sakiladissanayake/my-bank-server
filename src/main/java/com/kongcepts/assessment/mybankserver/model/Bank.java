package com.kongcepts.assessment.mybankserver.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Sakila Dissanayake
 *
 */
@Entity
@Table(name = "Bank")
@EntityListeners(AuditingEntityListener.class)
public class Bank {

	@Id
	@Column(name = "bank_id", nullable = false)
	private int bankId;

	@Column(name = "bank_name", nullable = false)
	private String bankName;

	@OneToMany(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private List<Branch> branches;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

}
