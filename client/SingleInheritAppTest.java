package com.tns.curdInherit.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.singleInheritances.entities.Manager_info;


public class SingleInheritAppTest {

	public static void main(String[] args) {
		
		// Defining persistence manager factory.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		//Defining persistence manager.
		EntityManager con = factory.createEntityManager();	
	
		con.getTransaction().begin();
		
//		Perform create operation
//		Employee_info employee = new Employee_info(); 
//		employee.setEmpId(2);
//		employee.setEmpName("Siddhant Niv");
//		employee.setEmpSal(2335);
//		con.persist(employee);
	
		Manager_info mgr_obj = new Manager_info();
		mgr_obj.setEmpId(2);
		mgr_obj.setEmpName("Siddhant Anand Nivilkar");
		mgr_obj.setEmpSal(4445);
		con.persist(mgr_obj);
		
//      performing Read operation
//		Employee_info data_obj = con.find(Employee_info.class, 1);
//		System.out.println("Emp Name: "+data_obj.getEmpName()+" \nEmp id: "+data_obj.getEmpId());
//		System.out.println("Emp sal: "+data_obj.getEmpSal()+" \nEmp status: "+data_obj.getEmp_type());
		
		
		con.getTransaction().commit();
		con.close();
		factory.close();
		

	}

}
