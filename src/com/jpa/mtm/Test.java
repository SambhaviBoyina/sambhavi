package com.jpa.mtm;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e1=new Employee();
		e1.setEmpid(12);
		e1.setName("dsgfdgsfd");
		e1.setDateofjoin(new Date());
		
		Employee e2=new Employee();
		e2.setEmpid(234);
		e2.setName("yrgfetfte");
		e2.setDateofjoin(new Date());
		
		Project p1=new Project();
		p1.setPid(4);
		p1.setDuration("15days");
		
		
		
		Project p2=new Project();
		p2.setPid(5);
		p2.setDuration("20days");
		
		e1.addProjects(p1);
		e1.addProjects(p2);
		
		e2.addProjects(p1);
		e2.addProjects(p2);
		
		
		em.persist(e1);
		em.persist(e2);
		
		System.out.println("Added orders along with order details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
