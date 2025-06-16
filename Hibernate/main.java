package com.telusko;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws HibernateException {


            Alien A1 = new Alien();     // create a object of alien class
            A1.setAge(104);             // add primary key data
            A1.getName("navfn");        // add data its problem to not inserted in mysql
            A1.getTeam("java");

            Configuration config = new Configuration();
            config.addAnnotatedClass(com.telusko.Alien.class);
            config.configure();

            SessionFactory factory = config.buildSessionFactory();

            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();

//            session.persist(A1);  // add data in mysql table alien

//     Alien A1 = session.find(Alien.class , 103);  // its fetching data from mysql database
            transaction.commit();

//            session.merge(A1);  update something

//            session.remove(A1);   delete data


            System.out.print(A1);
session.close();
factory.close();


    }
}
