package saleofgoods;

public class Customer {
	private String id;
	private String name;
	private String numberPhone;
	private String address;

	public Customer() {
	}

	public Customer(String id, String name, String numberPhone, String address) {
		this.id = id;
		this.name = name;
		this.numberPhone = numberPhone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
