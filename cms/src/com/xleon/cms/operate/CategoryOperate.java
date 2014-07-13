package com.xleon.cms.operate;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import com.xleon.cms.entity.Category;

public class CategoryOperate {
//	public static void main(String[] args) {
//		
//		Category c = new Category();
//		c.setCategory_name("hibernate demo");
//		c.setCategory_date(new Date());
//		
//		Configuration cfg = new Configuration().configure();
//		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
//		StandardServiceRegistry ssr = ssrb.build();
//		SessionFactory sf = cfg.buildSessionFactory(ssr);
//		
//		Session session = sf.openSession();
//		session.beginTransaction();
//		session.save(c);
//		session.getTransaction().commit();
//		session.close();
//		sf.close();
//	}
	
	private static Logger log = org.apache.log4j.Logger.getLogger(MysqlTemplate.class.getName());
	
	public static void main(String[] args) {
		
		Session querysession = HibernateUtil.getSession();
//		String hql = "from Category as category where category.category_name=:name";
//		Query query = querysession.createQuery(hql);
//		query.setString("name", "hibernate demo");
		
		String hql = "from Category";
		Query query = querysession.createQuery(hql);
		List<Category> categorylist = query.list();
		for (Category category : categorylist) {
			log.debug("[xleon_debug] categoryid:"+category.getCategory_id());
			log.debug("[xleon_debug] categoryname:"+category.getCategory_name());
			log.debug("[xleon_debug] categorydate:"+category.getCategory_date());
		}
		HibernateUtil.closeSession();
		
		Category c = new Category();
		c.setCategory_name("hibernate demo");
		c.setCategory_date(new Date());
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
		
		log.debug("[xleon_debug] add category end");
		log.debug("[xleon_debug] add category id is :"+c.getCategory_id());
		
		Session querysession1 = HibernateUtil.getSession();
		String hql1 = "from Category";
		Query query1 = querysession1.createQuery(hql1);
		List<Category> categorylist1 = query1.list();
		for (Category category : categorylist1) {
			log.debug("[xleon_debug] categoryid:"+category.getCategory_id());
			log.debug("[xleon_debug] categoryname:"+category.getCategory_name());
			log.debug("[xleon_debug] categorydate:"+category.getCategory_date());
		}
		HibernateUtil.closeSession();
		
		c.setCategory_name("modify by xleon");
		Session session2 = HibernateUtil.getSession();
		session2.beginTransaction();
		session2.update(c);
		session2.getTransaction().commit();
		HibernateUtil.closeSession();
		
		log.debug("[xleon_debug] update category id is :"+c.getCategory_id());
		log.debug("[xleon_debug] update category end");
		
		Session querysession2 = HibernateUtil.getSession();
		String hql2 = "from Category";
		Query query2 = querysession2.createQuery(hql2);
		List<Category> categorylist2 = query2.list();
		for (Category category : categorylist2) {
			log.debug("[xleon_debug] categoryid:"+category.getCategory_id());
			log.debug("[xleon_debug] categoryname:"+category.getCategory_name());
			log.debug("[xleon_debug] categorydate:"+category.getCategory_date());
		}
		HibernateUtil.closeSession();
		
		Session session3 = HibernateUtil.getSession();
		session3.beginTransaction();
		session3.delete(c);
		session3.getTransaction().commit();
		HibernateUtil.closeSession();
		log.debug("[xleon_debug] delete category id is :"+c.getCategory_id());
		log.debug("[xleon_debug] delete category end");
		
		Session querysession3 = HibernateUtil.getSession();
		String hql3 = "from Category";
		Query query3 = querysession3.createQuery(hql3);
		List<Category> categorylist3 = query3.list();
		for (Category category : categorylist3) {
			log.debug("[xleon_debug] categoryid:"+category.getCategory_id());
			log.debug("[xleon_debug] categoryname:"+category.getCategory_name());
			log.debug("[xleon_debug] categorydate:"+category.getCategory_date());
		}
		HibernateUtil.closeSession();
	}
}
