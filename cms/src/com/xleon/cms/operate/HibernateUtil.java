package com.xleon.cms.operate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// SessionFactory会话工厂  
    private static SessionFactory sessionFactory = null;  
    
    //ThreadLocal并不是线程本地化的实现,而是线程局部变量。也就是说每个使用该变量的线程都必须为
	//该变量提供一个副本,每个线程改变该变量的值仅仅是改变该副本的值,而不会影响其他线程的该变量
	//的值.
	
	//ThreadLocal是隔离多个线程的数据共享，不存在多个线程之间共享资源,因此不再需要对线程同步 
    // 线程局部变量管理  
    private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();  
  
    // 写在static块是因为该块只会被类被ClassLoader加载到虚拟机的时候执行一次  
    static {  
        try {  
            // 使用Configuration()对象.configure()方法去读取src/hibernate.cfg.xml配置文件  
        	Configuration cfg = new Configuration().configure();
    		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
    		StandardServiceRegistry ssr = ssrb.build();
    		sessionFactory = cfg.buildSessionFactory(ssr); 
        } catch (Throwable e) {// 如果在执行static块的时候出现任何的Throwable(Error和Exception的类的父类)则处理  
            // 抛出明确的static程式错误的异常  
            throw new ExceptionInInitializerError(e);  
        }  
    }  
  
    /** 
     *  
     * 获得SessionFactory这个就不说了 
     *  
     * @return SessionFactory 
     */  
    public static SessionFactory getSessionFactory() {  
        return sessionFactory;  
    }  
  
    /** 
     * 获得Session会话对象 
     *  
     * @return Session 
     */  
  
    public static Session getSession() {  
        // 首先从线程局部变量中有没有session,以免还要openSession();  
        Session session = threadLocal.get();  
        // 如果是空或者没有打开  
        if (session == null || !session.isOpen()) {  
            // 则打开(因为static块有可能出错,所以这里进行三元判断)  
            session = sessionFactory != null ? sessionFactory.openSession()  
                    : null;  
            // 设置到线程局部变量中  
            threadLocal.set(session);  
        }  
        return session;  
    }  
  
    // 关闭Session  
    public static void closeSession() {  
        // 获得线程局部变量中的session  
        Session session = threadLocal.get();  
        // 设置为空,当再次调用openSession()的时候才能打开Session  
        threadLocal.set(null);  
        if (session != null) {  
            session.close();  
        }  
    }  
}
