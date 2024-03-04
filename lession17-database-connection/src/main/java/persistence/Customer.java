package persistence;

import java.util.Objects;

public class Customer  {
	private Integer id;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String passwork;
	
	
	public Customer() {
	}


	public Customer(Integer id, String name, String email, String address, String phone, String passwork) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.passwork = passwork;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPasswork() {
		return passwork;
	}


	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone="
				+ phone + ", passwork=" + passwork + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Customer)) {
			return false;
		}
	
		Customer that = (Customer)o;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}
