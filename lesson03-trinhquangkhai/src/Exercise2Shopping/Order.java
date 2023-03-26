package Exercise2Shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
private Customer customer;
private ItemDetail[] itemdetail;
private LocalDateTime orderDate;
public Order() {
}
public Order(Customer customer, ItemDetail[] itemdetail, LocalDateTime orderDate) {
	super();
	this.customer = customer;
	this.itemdetail = itemdetail;
	this.orderDate = orderDate;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public ItemDetail[] getItemdetail() {
	return itemdetail;
}
public void setItemdetail(ItemDetail[] itemdetail) {
	this.itemdetail = itemdetail;
}
public LocalDateTime getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDateTime orderDate) {
	this.orderDate = orderDate;
}
@Override
public String toString() {
	return "Order [customer=" + customer + ", itemdetail=" + Arrays.toString(itemdetail) + ", orderDate=" + orderDate
			+ "]";
}
public double export() {
	double totalofmoney = 0;
	ItemDetail[] ids = getItemdetail();
	for(ItemDetail id: ids) {
		Item item = id.getItem();
		int quantity = id.getQuantity();
		double idCost = item.getCost()* quantity;
		if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())) {
			idCost *= .9;
		}
		totalofmoney += idCost;
		
	}
	return totalofmoney;
	
}
}
