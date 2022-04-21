package com.tns.singleInheritances.entities;

import javax.persistence.*;



@Entity
@DiscriminatorValue(value="MGR")
public class Manager_info extends Employee_info {
	
	// Defining serializale_id 
	private static final long serialVersionUID = 2L;
	
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
