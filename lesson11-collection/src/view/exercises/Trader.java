package view.exercises;

public class Trader {
	private String name;
	private String woringCity;
	
	public Trader() {
	}

	public Trader(String name, String woringCity) {
		this.name = name;
		this.woringCity = woringCity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWoringCity() {
		return woringCity;
	}

	public void setWoringCity(String woringCity) {
		this.woringCity = woringCity;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", woringCity=" + woringCity + "]";
	}
}
