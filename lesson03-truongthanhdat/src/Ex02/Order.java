package Ex02;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemdetails;
	private LocalDateTime orderDate;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemdetails, LocalDateTime orderDate) {
		super();
		this.customer = customer;
		this.itemdetails = itemdetails;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemdetails() {
		return itemdetails;
	}

	public void setItemdetails(ItemDetail[] itemdetails) {
		this.itemdetails = itemdetails;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "customer is:" + this.customer.getName() + "\nlist itemdetails is:" + Arrays.toString(itemdetails) + "\ntime is:"
				+ this.orderDate;
	}
	
	
	
}
