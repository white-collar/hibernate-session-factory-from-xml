import entities.Stock;
import entities.StockDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

import java.util.Date;

public class HibernateDemo {

    public static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Stock stock = new Stock();

        stock.setStockCode("7052");
        stock.setStockName("AmazonI");

        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("Netflix");
        stockDetail.setCompDesc("one stop shopping");
        stockDetail.setRemark("Love,Death&Robots");
        stockDetail.setListedDate(new Date());

        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);

        session.save(stock);
        session.getTransaction().commit();
        sessionFactory.close();

    }
}
