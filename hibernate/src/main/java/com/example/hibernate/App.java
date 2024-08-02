package com.example.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	
//        Configuration con=new Configuration().configure("hibernate.cfg.xml");
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata mt=new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory sf=mt.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t= s.beginTransaction();
        hibernate h=new hibernate();
        h.setName("keerthi");
        h.setEmail("kav@gmail.com");
        h.setPassword("kav123");
        h.setPhoneno(852741930);
        s.save(h);
        t.commit();
        System.out.println("successfully inserted");
        sf.close();
        s.close();
        
    }
}
