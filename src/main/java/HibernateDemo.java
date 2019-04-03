import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class HibernateDemo {

    public static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = HibernateUtils.getSessionFactory();
        System.out.println(sessionFactory);
    }
}
