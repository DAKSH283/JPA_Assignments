package com.cg.author;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorTest {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		 Author author = new Author();
//		 author.setAuthorId(22);
		 author.setFirstName("John");
		 author.setMiddleName("kumar");
		 author.setLastName("Sharma");
		 author.setPhoneNo(225685);
		 em.getTransaction().begin();
		em.persist(author);
	    em.getTransaction().commit();
		System.out.println("Added one student to database.");

		 int id = 22;
		 author = em.find(Author.class, id);
		author.setFirstName("rahul");
		author.setMiddleName("kumar");
		 author.setLastName("Sharma");
		 author.setPhoneNo(225685);
	     em.getTransaction().begin();
		 em.merge(author);
		em.getTransaction().commit();
		 System.out.println("Updated student to database.");

		  id = 22;
		 author = em.find(Author.class, id);
		 em.getTransaction().begin();
		em.remove(author);
		 em.getTransaction().commit();
		 System.out.println("Removed student from database.");

		em.close();
		factory.close();
	}

	}


