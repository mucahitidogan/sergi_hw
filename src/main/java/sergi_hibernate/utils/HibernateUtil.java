package sergi_hibernate.utils;

import sergi_hibernate.entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sergi_hibernate.entities.*;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null){
            try{
                Configuration configuration = new Configuration();
                //Bu aslında hibernate.cfg.xml'deki mapping yerine kullanılıyor.
                //Orada ya da burada kullanarak diğerini kullanmıyoruz.
                configuration.addAnnotatedClass(Muze.class);
                configuration.addAnnotatedClass(Eser.class);
                configuration.addAnnotatedClass(Sanatci.class);
                configuration.addAnnotatedClass(Sergi.class);
                configuration.addAnnotatedClass(Ziyaretci.class);
                sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
