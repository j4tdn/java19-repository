package view.exercises;

public class Trader {
	private String fullname;
	private String city;
	public String getName() {
		return fullname;
	}
	public void setName(String name) {
		this.fullname = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Trader(String name, String city) {
		this.fullname = name;
		this.city = city;
	}
	public Trader() {
	}
	@Override
	public String toString() {
		return "Trader [fullname=" + fullname + ", city=" + city + "]";
	}
}
