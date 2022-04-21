package com.tns.joined.entites;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//Above annotation states that, the below class is a table in DB
@Table(name="newDebitAccount")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class newDebitAccount extends JoinAccount{

	// Defining serializale_id 
	private static final long serialVersionUID = 1L;

	// Defining private instance variable
	private double overdraftFee;
	
	// Defining getter and setter methods to read and write private instance variable.
	@Column(name="overdraftFee")
	public double getOverdraftFee() {
		return overdraftFee;
	}
	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}

}
