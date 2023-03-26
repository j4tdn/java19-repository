package shopping;

public class Customer {
	private String id;
	private String name;
	private String phone;
	private String andress;
	
	public Customer() {
	}

	public Customer(String id, String name, String phone, String andress) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.andress = andress;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAndress() {
		return andress;
	}

	public void setAndress(String andress) {
		this.andress = andress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", andress=" + andress + "]";
	}
	
	
	
	
}
