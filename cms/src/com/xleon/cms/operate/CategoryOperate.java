package com.xleon.cms.operate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.xleon.cms.entity.Category;

public class CategoryOperate {
	public static void main(String[] args) {
		
		Category c = new Category();
		c.setCategory_name("hibernate demo");
		c.setCategory_date(new Date());
		
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
		
		
//		Configuration cfg = new Configuration().configure();
//		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
//		StandardServiceRegistry ssr = ssrb.build();
//		SessionFactory sf = cfg.buildSessionFactory(ssr);
//		Session session = sf.openSession();
//		
//		Transaction t = session.beginTransaction();
//		
//		t.commit();
//		session.close();
//		sf.close();
		

		
//		SessionFactory sf = new Configuration()
//        .configure() // configures settings from hibernate.cfg.xml
//        .buildSessionFactory();
//		
//		Session session = sf.openSession();
//		session.beginTransaction();
//		session.save(c);
//		session.getTransaction().commit();
//		session.close();
//		
//		sf.close();
		
		
		
	}
}
