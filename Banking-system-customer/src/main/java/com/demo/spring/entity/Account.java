package com.demo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@Id
	@Column(name = "accNo")
	private long accountNo;
	@Column(name = "branch")
	private String branch;
	@Column(name = "accType")
	private String accType;
	@Column(name = "balance")
	private double balance;
	@Column(name = "status")
	private String status;

	public Account() {

	}

	@Override
	public String toString() {
		return "accountNo=" + accountNo + ", branch=" + branch + ", accType=" + accType + ", balance=" + balance
				+ ", status=" + status;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
