package com.cg.entities;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="employee")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="EMP")
public class Employee implements Serializable {
	private static final long serialversionUID =1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeid;
	private String Name;
	private double salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}


