package view.exercises;

public class Trader {
	
	private String fullname;
	private String city;
	
	public Trader() {
	}

	public Trader(String fullname, String city) {
		this.fullname = fullname;
		this.city = city;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [fullname=" + fullname + ", city=" + city + "]";
	}
}
