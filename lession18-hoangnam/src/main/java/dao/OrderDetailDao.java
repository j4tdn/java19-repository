package dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import persistence.entities.OrderDetail;
import java.util.Date;
import java.util.List;

public class OrderDetailDao extends BaseHibernateDao {

    public List<OrderDetail> findOrderDetailsByDate(Date date) {
        try (Session session = openSession()) {
            String hql = "FROM OrderDetail od WHERE DATE(od.createdTime) = :date ORDER BY od.createdTime DESC, od.item.id ASC";
            Query<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
            query.setParameter("date", date);
            return query.getResultList();
        }
    }
}
