package com.aits.JPADemo;

import jakarta.persistence.EntityManager;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		 Author author = new Author("George Orwell");
	        author.addBook(new Book("1984"));
	        author.addBook(new Book("Animal Farm"));
	        em.persist(author);
	        
	        em.getTransaction().commit();
	        
	        em.getTransaction().begin();
	        Author fetchedAuthor = em.find(Author.class, author.getId());
	        System.out.println("Author: " + fetchedAuthor.getName());
 
	        System.out.println("Accessing books...");
	        for (Book book : fetchedAuthor.getBooks()) { // SQL runs here!
	            System.out.println("Book: " + book.getTitle());
	        }
	        em.getTransaction().commit();
	        em.close();
	        JPAUtil.close();
	}
 
}