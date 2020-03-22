package com.wh.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.wh.pojo.Role;
import com.wh.pojo.User;
import com.wh.utils.HibernateUtils;

public class SaveAll {
	
   @Test
   public void SaveTest() {
	      
	   Session session = HibernateUtils.getSession();
	   Transaction transaction = session.beginTransaction();
	   User user = new User("³Â¹ÚÏ£",26);
	   session.save(user);
	   
	   transaction.commit();
	   session.close();
	  
	   }
   @Test
   public void selById() {
	   Session session = HibernateUtils.getSession();
	   Transaction tx = session.beginTransaction();
	   User user = session.get(User.class, 2);
	   System.out.println(user);
	   tx.commit();
	   session.close();
   }
   @Test
   public void selAll() {
	   Session session = HibernateUtils.getSession();
	   Transaction tx = session.beginTransaction();
	    //List<User> list = session.createQuery("from user", User.class).list();
	    //list.forEach(System.out::println);
	   List<User> list =  session.createCriteria(User.class).list();
	   list.forEach(System.out::println);
	  tx.commit();
	  session.close();
	   
   }
   @Test
   public void updateOne() {
	   
	   Session session = HibernateUtils.getSession();
	   Transaction tx = session.beginTransaction();
	   User user = session.get(User.class, 2);
	   user.setAge(66);
	   session.update(user);
	   tx.commit();
	   session.close();
	   
   }
   @Test
   public void insertRole() {
	   Session session = HibernateUtils.getSession();
	   Transaction tx = session.beginTransaction();
	   Role role = new Role("µºÖ÷");
	   session.save(role);
	   tx.commit();
	   session.close();
   }
   
   
   public static void main(String[] args) {
	     
}
}
