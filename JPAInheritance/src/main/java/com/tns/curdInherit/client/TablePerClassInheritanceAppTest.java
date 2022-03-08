package com.tns.curdInherit.client;

import com.tns.tableperclass.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassInheritanceAppTest {

	public static void main(String[] args) {
		
		// Defining persistence manager factory.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
				
		//Defining persistence manager.
		EntityManager con = factory.createEntityManager();
				
			
		con.getTransaction().begin();
		
//		Account acc_obj = new Account();
//		acc_obj.setId(134L);
//		acc_obj.setBalance(542.6d);
//		acc_obj.setOwner("Sidd");
//		acc_obj.setInterestRate(1.0d);
//		con.persist(acc_obj);
		
//		CreditAccount cre_obj = new CreditAccount();
//		cre_obj.setId(134L);
//		cre_obj.setBalance(542.6d);
//		cre_obj.setOwner("Sidd");
//		cre_obj.setInterestRate(1.0d);
//		cre_obj.setCreditLimit(5.28d);
//		con.persist(cre_obj);
		
		DebitAccount debObj = new DebitAccount();
		debObj.setId(124L);
		debObj.setBalance(542.6d);
		debObj.setOwner("Sidd");
		debObj.setOverdraftFee(4521.58);
		con.persist(debObj);
		
		
		
		con.getTransaction().commit();
		factory.close();
		con.close();
		

	}

}
