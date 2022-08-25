package com.cg.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class InheritanceTest {
	public static void main(String args[]) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
//		create one employee
		Employee employee=new Employee();
		employee.setName("shahid");
		employee.setSalary(5000);
		em.persist(employee);
		//create one manager
				Manager manager = new Manager();
				manager.setName("potter");
				manager.setSalary(8000);
				manager.setDepartmentName("Sales");
				em.persist(manager);
		
		em.getTransaction().commit();
		
		
		em.close();
		factory.close();
		System.out.println("Added one employee and manager to database.");
	}

}
