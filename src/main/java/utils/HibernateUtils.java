package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
    public static SessionFactory sessionFactory;

    // close constructor
    private HibernateUtils() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory =  new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}
