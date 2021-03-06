package com.nt.entity;
// Generated May 22, 2019 5:46:31 PM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private int eno;
	private String ename;
	private String desg;
	private float salary;

	public Employee() {
	}

	public Employee(int eno) {
		this.eno = eno;
	}

	public Employee(int eno, String ename, String desg, float salary) {
		this.eno = eno;
		this.ename = ename;
		this.desg = desg;
		this.salary = salary;
	}

	public int getEno() {
		return this.eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesg() {
		return this.desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
