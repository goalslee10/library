package dev.web.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.web.member.Member;

@RestController
public class MemberController {
	
	@RequestMapping("/memberAdd")
	public Member getMember(@RequestParam("userid") String userid, @RequestParam("username") String username, @RequestParam("passwd") String passwd) {
		
		Member member = new Member();
		member.setUserid(userid);
		member.setPasswd(passwd);
		member.setUsername(username);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("library_final");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			
			em.persist(member);
			
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
		return member;
	}
	
}