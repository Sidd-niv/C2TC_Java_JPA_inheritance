package com.tns.joined.entites;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//Above annotation states that, the below class is a table in DB
@Table(name="newCreditAccount")
public class newCreditAccoun extends JoinAccount{

	// Defining serializale_id 
	private static final long serialVersionUID = 1L;
	
	// Defining private instance variable
	@Column(name="creditLimit")
	private double creditLimit;
	
	
	// Defining getter and setter methods to read and write private instance variable.
	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	

}
