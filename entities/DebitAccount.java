package com.tns.tableperclass.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//Above annotation states that, the below class is a table in DB.
@Table(name="DebitAccount")
public class DebitAccount extends Account{
	
	// Defining serializale_id 
	private static final long serialVersionUID = 1L;
	
	// Defining private instance variable
	
	// With Id annotation we are indicating that this is a primary key field
	@Column(name="overdraftFee")
	private double overdraftFee;
	
	// Defining getter and setter methods to read and write private instance variable.
	public double getOverdraftFee() {
		return overdraftFee;
	}
	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}


}
