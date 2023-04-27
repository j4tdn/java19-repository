package ex05;

import java.awt.print.Book;

public class Order {
	private int orderId;
	private Customer customer;
	private Book[] books;
	
	public Order(int orderId, Customer customer, Book[] books) {
		this.orderId = orderId;
		this.customer = customer;
		this.books = books;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	
	
	
}
