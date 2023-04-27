package ex05;

public class Customer {
	private int customerId;
	private String name;
	private String phoneNumber;
	private String address;
	
	public Customer(int customerId, String name, String phoneNumber, String address) {
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
