package com.hibernate.HibernatePractice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernatePractice.model.Alien;
import com.hibernate.HibernatePractice.model.Laptop;
import com.hibernate.HibernatePractice.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Alien telusko=new Alien();
//        telusko.setAid(102);
//        telusko.setAname("Xavier");
//        telusko.setColor("Red");
//        
//    	Laptop laptop1=new Laptop();
//    	laptop1.setId(101);
//    	laptop1.setLname("Dell");
//    	
//    	Laptop laptop2=new Laptop();
//    	laptop2.setId(102);
//    	laptop2.setLname("HP");
//    	
//    	Student student1=new Student();
//    	student1.setName("Xavier");
//    	student1.setRollno(1);
//    	student1.setMarks(50);
//    	student1.getLaptop().add(laptop1);
//    	student1.getLaptop().add(laptop2);
//    	
//    	Student student2=new Student();
//    	student2.setName("Francis");
//    	student2.setRollno(2);
//    	student2.setMarks(60);
//    	student2.getLaptop().add(laptop1);
//    	
//    	laptop1.getStudent().add(student1);
//    	laptop1.getStudent().add(student2);
    	
    	
    	
        Configuration con=new Configuration().configure();
        SessionFactory sf=con.buildSessionFactory();
        Session openSession = sf.openSession();
        Transaction tx = openSession.beginTransaction();
//        openSession.save(telusko);
//        openSession.persist(laptop1);
//        openSession.persist(laptop2);
//        
//        openSession.persist(student1);
//        openSession.persist(student2);
        
        Student student = openSession.get(Student.class,1);
      
        
        tx.commit();
    }
}
