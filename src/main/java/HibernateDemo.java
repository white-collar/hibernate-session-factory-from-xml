import entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

public class HibernateDemo {

    public static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Employee employee = new Employee();
        employee.setEmail("email@email.com");
        employee.setFirstName("Sherlock");
        employee.setLastName("Holmes");

        session.save(employee);
        session.getTransaction().commit();
        sessionFactory.close();

    }
}
