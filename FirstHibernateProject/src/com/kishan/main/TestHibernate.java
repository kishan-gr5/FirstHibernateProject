package com.kishan.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


import com.kishan.hibernate.dto.Address;
import com.kishan.hibernate.dto.UserDetails;

public class TestHibernate 
{
	public static void main(String[] args) 
	{
		UserDetails user = new UserDetails();
			user.setUserName("First user");
		user.setJoinedDate(new Date());
		
		Address addr = new Address();
		addr.setStreet("yelahanka");
		addr.setCity("bangalore");
		user.getListOfAddress().add(addr);
		
		Address addr2 = new Address();
		addr2.setStreet("new bel");
		addr2.setCity("bangalore");
		user.getListOfAddress().add(addr2);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		System.out.println("success");
		session.close();
		
	}
}
