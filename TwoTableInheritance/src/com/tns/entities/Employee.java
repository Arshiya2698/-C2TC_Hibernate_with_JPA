package com.tns.entities;
import javax.persistence.*;
import javax.persistence.Inheritance;

import java.io.Serializable;
@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.JOINED)		//This annotation must be written only on parent class
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	private String name;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
