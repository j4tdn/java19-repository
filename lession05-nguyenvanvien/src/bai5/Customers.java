package bai5;

public class Customers {
	private int idCustomer;
	private String name;
	private String phoneNumber;
	private String address;
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
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
	public Customers(int idCustomer, String name, String phoneNumber, String address) {
		super();
		this.idCustomer = idCustomer;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	
}
