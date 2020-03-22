package com.wh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wh.pojo.User;

public class Test {
       
	public static void main(String[] args) {
		Configuration configure = new Configuration().configure();
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = new User("ÎâÑå×æ",25);
		session.save(user);
		transaction.commit();
		session.close();
	}
}
