import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

    public static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory =  new Configuration().configure().buildSessionFactory();
    }
}
