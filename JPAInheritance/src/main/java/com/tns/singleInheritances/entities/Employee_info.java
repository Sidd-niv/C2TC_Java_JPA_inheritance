package com.tns.singleInheritances.entities;

import java.io.Serializable;

import javax.persistence.*;


// With this Annotation we are specifying that this is a table
@Entity
@Table(name="Employee_info")
// Above annotation states that, the below class is a table in DB.

// The inheritance annotation will tell the JVM we are performing the inheritances of Single Table type which is specified using strategy.
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

// DiscriminatorColumn specifies the column name which is not present 
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="EMP") 
public class Employee_info implements Serializable{
	
	// Defining serializale_id 
	private static final long serialVersionUID = 1L;
	
	// Defining private instance variable
	
	// With Id annotation we are indicating that this is a primary key field
	@Id
	// With Column annotation we are specifying the column name
	@Column(name="empId")
	private int empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empSal")
	private int empSal;

	
	// Defining getter and setter methods to read and write private instance variable.
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

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
//	private String emp_type;
//
//	/**
//	 * @return the emp_type
//	 */
//	public String getEmp_type() {
//		return emp_type;
//	}
//
//	/**
//	 * @param emp_type the emp_type to set
//	 */
//	public void setEmp_type(String emp_type) {
//		this.emp_type = emp_type;
//	}
	
	

}
