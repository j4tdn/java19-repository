package bean;

public class CD {
	private int id;
	private String type;
	private String singer;
	private int amountOfSing;
	private double price;

	public CD(int id, String type, String singer, int amountOfSing, double price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.amountOfSing = amountOfSing;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getAmountOfSing() {
		return amountOfSing;
	}

	public void setAmountOfSing(int amountOfSing) {
		this.amountOfSing = amountOfSing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(this instanceof CD)) {
			return false;
		}
		CD that = (CD)o;
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", singer=" + singer + ", amountOfSing=" + amountOfSing + ", price="
				+ price + "]";
	}
}
