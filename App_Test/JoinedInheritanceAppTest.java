package com.tns.curdInherit.client;

import com.tns.joined.entites.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedInheritanceAppTest {

	public static void main(String[] args) {
	
		// Defining persistence manager factory.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
				
		//Defining persistence manager.
		EntityManager con = factory.createEntityManager();
				
			
		con.getTransaction().begin();
		
//		newCreditAccount cerAcc = new newCreditAccount();
//		cerAcc.setId(123L);
//		cerAcc.setBalance(10000.0);
//		cerAcc.setInterestRate(10.0);
//		cerAcc.setOwner("Ramesh");
//		cerAcc.setCreditLimit(10000.0);
//        con.persist(cerAcc);
        
        newDebitAccount debAcc = new newDebitAccount();
        debAcc.setId(234L);
        debAcc.setBalance(10000.0);
        debAcc.setInterestRate(10.0);
        debAcc.setOwner("Ramesh");
        debAcc.setOverdraftFee(100.0);
        con.persist(debAcc);
		
		con.getTransaction().commit();
		con.close();
		factory.close();
	}

}


