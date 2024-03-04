package service;

import java.util.Date;
import java.util.List;
import persistence.entities.OrderDetail;

public interface OrderDetailService {
    List<OrderDetail> findOrderDetailsByDate(Date date);
}


