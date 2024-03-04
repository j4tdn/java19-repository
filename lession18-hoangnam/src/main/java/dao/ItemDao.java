package dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import persistence.entities.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDao extends BaseHibernateDao {

    public List<Object[]> getItemsStock() {
        try (Session session = openSession()) {
            String hql = "SELECT i.itemGroup.id, i.itemGroup.name, SUM(i.amount) " +
                         "FROM Item i " +
                         "GROUP BY i.itemGroup.id, i.itemGroup.name";
            Query<Object[]> query = session.createQuery(hql, Object[].class);
            return query.getResultList();
        }
    }
    public List<String> getTopSellingItems(int year) {
        try (Session session = openSession()) {
            String sql = "SELECT i.name, SUM(od.amount) as total_amount " +
                         "FROM order_detail od " +
                         "JOIN item i ON od.item_id = i.id " +
                         "JOIN `order` o ON od.order_id = o.id " +
                         "WHERE YEAR(o.created_at) = :year " +
                         "GROUP BY i.id, i.name " +
                         "ORDER BY total_amount DESC, i.id DESC " +
                         "LIMIT 3";

            List<Object[]> resultList = session.createNativeQuery(sql)
                .setParameter("year", year)
                .getResultList();

            List<String> topSellingItems = new ArrayList<>();
            for (Object[] row : resultList) {
                topSellingItems.add((String) row[0]);
            }
            return topSellingItems;
        }
    }

}
