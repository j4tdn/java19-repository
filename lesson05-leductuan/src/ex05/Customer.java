package ex05;

<<<<<<< HEAD
public class Customer {
	private String mkh;
	private String hoten;
	private String sdt;
	private String diachi;
	
	public Customer() {
	}

	public Customer(String mkh, String hoten, String sdt, String diachi) {
		this.mkh = mkh;
		this.hoten = hoten;
		this.sdt = sdt;
		this.diachi = diachi;
	}

	public String getMkh() {
		return mkh;
	}

	public void setMkh(String mkh) {
		this.mkh = mkh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Override
	public String toString() {
		return "Customer [mkh=" + mkh + ", hoten=" + hoten + ", sdt=" + sdt + ", diachi=" + diachi + "]";
	}
	
	
	
}
=======
class Customer {
    String id;
    String name;
    String phone;
    String address;

    public Customer(String id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }
}
>>>>>>> f17414c (lesson05-exam-leductuan27/04/2023)
