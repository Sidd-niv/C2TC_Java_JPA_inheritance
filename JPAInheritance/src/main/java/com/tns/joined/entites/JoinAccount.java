package com.tns.joined.entites;

import javax.persistence.*;
import java.io.Serializable;


//Below annotation states that, the below class is a table in DB.
@Entity
//The inheritance annotation will tell the JVM we are performing the inheritances of Single Table type which is specified using strategy.
@Table(name="JoinAccount")
//The inheritance annotation will tell the JVM we are performing the inheritances of Joined type.
@Inheritance(strategy = InheritanceType.JOINED)
public class JoinAccount implements Serializable{
	
// Defining serializale_id 
private static final long serialVersionUID = 1L;
	

    //Defining private instance variable

	// With Id annotation we are indicating that this is a primary key field
	@Id
	// With Column annotation we are specifying the column name
	@Column(name="id")
	private Long id;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="balance")
	private double balance;
	
	@Column(name="interestRate")
	private double interestRate;
	
	// Defining getter and setter methods to read and write private instance variable.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
