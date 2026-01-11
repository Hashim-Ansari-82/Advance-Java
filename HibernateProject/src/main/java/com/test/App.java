package com.test;

import java.io.*;
import java.util.Date;
import org.hibernate.*; 
import org.hibernate.cfg.Configuration;

public class App{
	
    public static void main(String[] args)throws IOException{
    	
        System.out.println( "Project Started ..!" );
        Configuration cfg = new Configuration();
        cfg.configure("com/test/hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        /* Object create Student Class */
        
		Student st = new Student();
		st.setCity("new Delhi");
		st.setName("Raiyyan");
		
        /* Object create Address Class */
        
        Address ad=new Address();
        ad.setAddedDate(new Date());
        ad.setCity("new Mumbai");
        ad.setOpen(true);
        ad.setStreet("mumbai metro");
        ad.setX(143.9);
        @SuppressWarnings("resource")
		FileInputStream fis1=new FileInputStream("src/main/java/pic.jpg");
		byte[] data=new byte[fis1.available()];
		fis1.read(data); 
		ad.setImage(data);	
	   
        /* Object create College Class */
        
        College c=new College();
		c.setAddedDate(new Date());
		c.setAddress("Koilsa sant kabir nagar");
		c.setAge(24);
		c.setName("Arsalan Khan"); 
		c.setState("Nallasopara");
		FileInputStream fis2 = new FileInputStream("src/main/java/pic.png");
			byte[] image=new byte[fis2.available()];
			fis2.read(image); 
			c.setImage(image);
		
		 /* Object create Certificate Class */
		
		Certificate ct=new Certificate();
		ct.setCertificate_id(12345563);
		ct.setCertificate_name("Java Developer");
		ct.setCertificate_no(983565432);
		ct.setCertificate_title("Software Engineer");
		ct.setDate(new Date());
		ct.setStudent_name("Arsalan Khan");
		ct.setStudent_id("Arsalan123");

		session.persist(ct);
		session.persist(st);
		session.persist(ad);
        session.persist(c);
        tx.commit();
        session.close();
        System.out.println("Done ☑☑️");
    }
}
