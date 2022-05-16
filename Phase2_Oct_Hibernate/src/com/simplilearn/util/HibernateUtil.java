package com.simplilearn.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.simplilearn.entity.Eproduct;




public class HibernateUtil {
	public static SessionFactory buildSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Eproduct.class).buildSessionFactory();
		return sessionFactory;
	}

}
