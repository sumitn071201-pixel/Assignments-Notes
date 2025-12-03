
package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfigUtil {
	private static SessionFactory sf = null;
	
	private HibernateConfigUtil() {
		
	}
	
	public static SessionFactory getMySessionFactory() {
		if(sf==null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
	
	public static void closeMySessionFactory() {
		if(sf!=null) {
			sf.close();
		}
	}
}
