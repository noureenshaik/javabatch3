package com.takio.dao.impl;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Login Management- Hibernate
 */
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takio.dao.UserDAO;
import com.takio.entity.User;

public class UserDAOImpl implements UserDAO {

	// 1. Register
	@Override
	public int register(User user) {

		// status, is used to keep track if the update is successful
		int status = 0;

		// try- catch is used to handle duplicate primary key exception
		try {
			System.out.println("\nPlease Wait.........\n");

			Configuration cfg = new Configuration();
			cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();

			Session sess = factory.openSession();
			Transaction tx = sess.beginTransaction();

			Integer id = (Integer) sess.save(user);
			tx.commit();

			status = 1;
			System.out.println("\n===============================================");
			System.out.println("Customer Information is added, Successfully!!");
			System.out.println("=================================================\n");

		} catch (Exception e) {

			System.out.println("\n========================================");
			System.out.print("Duplicate Primary Key, Please TRY Again !! ");
			System.out.println("\n========================================");
		}
		return status;
	}

	// 2. Login : Returns true if user name and password matches
	@Override
	public boolean verifyUnameAndPass(String uname, String pass) {

		System.out.println("\nPlease Wait.........\n");
		Configuration cfg = new Configuration();
		cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();

		// if username&& password matches return true
		// else false
		Query q = sess.createQuery("select u from User u where username=:uname AND password=:pass");
		q.setParameter("uname", uname);
		q.setParameter("pass", pass);
		List<User> userRec = q.getResultList();

		// userRec is empty means the record with matching password and username
		// is not found from the database

		if (userRec.isEmpty()) {
			// Username & password didnot match
			return false;

		} else {
			// username and password is matched
			return true;
		}

	}

}
