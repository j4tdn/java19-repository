package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime orderDate;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemDetail = itemDetail;
		this.orderDate = orderDate;
	}




	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}
	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", orderDate="
				+ orderDate + "]";
	}
	
	
	public double export() {
		double totalMoney = 0;
		ItemDetail[] ids = getItemDetail();
		for(ItemDetail id: ids) {
			double idCost = id.getItem().getCost();
			if(LocalDate.of(2021,Month.MAY,8).isEqual(getOrderDate().toLocalDate()) && idCost > 590 ) {
				idCost = idCost * 0.9;
			}
			totalMoney += id.getQuantity() * idCost ;
		}
		return totalMoney;
	}
	
	
}
