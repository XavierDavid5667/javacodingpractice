package com.hibernate.HibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernatePractice.model.Alien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien telusko=new Alien();
        telusko.setAid(102);
        telusko.setAname("Xavier");
        telusko.setColor("Red");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf=con.buildSessionFactory();
        Session openSession = sf.openSession();
        Transaction tx = openSession.beginTransaction();
        openSession.save(telusko);
        tx.commit();
    }
}
