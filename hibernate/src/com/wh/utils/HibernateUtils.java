package com.wh.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
	
	private static Configuration cfg = null;
	
	private static SessionFactory factory = null;
	static {
		cfg = new Configuration().configure();
		
    factory	= cfg.buildSessionFactory();
	}
	public static Session getSession() {
		return factory.openSession();
	}

}
