package service;

import java.time.LocalDate;
import java.util.List;

import persistence.entities.Order;

public interface OrderService {
	
	List<Order> getItemsByDate(LocalDate salesDate);

}
