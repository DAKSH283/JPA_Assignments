package com.cg.jpastart.entities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.EntityManager;


public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Greet greet = new Greet();
		greet.setMessage("Welcome to JPA!");
		
		em.persist(greet);//setting the squall query
		
		
		System.out.println("Added greeting to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
