package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer custumer;	
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer custumer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		super();
		this.custumer = custumer;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
	}

	public Customer getCustumer() {
		return custumer;
	}

	public void setCustumer(Customer custumer) {
		this.custumer = custumer;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [custumer=" + custumer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDate="
				+ orderDate + "]";
	}
	

	
}
