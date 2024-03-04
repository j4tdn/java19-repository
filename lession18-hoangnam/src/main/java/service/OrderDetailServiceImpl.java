package service;

import java.util.Date;
import java.util.List;

import dao.OrderDetailDao;
import persistence.entities.OrderDetail;

public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailDao orderDetailDao = new OrderDetailDao();

    @Override
    public List<OrderDetail> findOrderDetailsByDate(Date date) {
        return orderDetailDao.findOrderDetailsByDate(date);
    }
}