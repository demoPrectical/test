package com;

import org.hibernate.Session;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel s = new StudentModel();
			s.setCity("califronia");
			s.setName("amberdon");
	
			session.save(s); // here we have to change in ACID property.

			session.beginTransaction().commit(); // transaction is committed then data will be save in to DB.
		}
	}
}
