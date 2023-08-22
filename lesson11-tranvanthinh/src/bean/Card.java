package bean;

public class Card {
	private String type;
	private Character order;

	public Card(String type, Character order) {
		this.type = type;
		this.order = order;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Character getOrder() {
		return order;
	}

	public void setOrder(Character order) {
		this.order = order;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(this instanceof Card)) {
			return false;
		}
		Card that = (Card)o;
		return (getType() == that.getType() && getOrder() == that.getOrder() );
	}

	@Override
	public String toString() {
		return "Card [type=" + type + ", order=" + order + "]";
	}
	
}
