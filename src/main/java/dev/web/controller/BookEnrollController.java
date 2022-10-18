package dev.web.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.web.model.Book;

@RestController
public class BookEnrollController {
	
	@RequestMapping("/bookEnroll")
	public Book getBook(@RequestParam("bookName") String bookName, @RequestParam("authorName") String authorName) {
		
		Book book = new Book();
		book.setBookName(bookName);
		book.setAuthorName(authorName);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("library_final");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			
			em.persist(book);
			
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
		return book;
	}
	
}
