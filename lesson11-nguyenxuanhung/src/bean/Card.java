package bean;

import cardEnum.TypeCardEnum;
import cardEnum.ValueCardEnum;

public class Card {
	private TypeCardEnum type;
	private ValueCardEnum value;
	public Card() {
	}
	public Card(TypeCardEnum type, ValueCardEnum value) {
		this.type = type;
		this.value = value;
	}
	public TypeCardEnum getType() {
		return type;
	}
	public void setType(TypeCardEnum type) {
		this.type = type;
	}
	public ValueCardEnum getValue() {
		return value;
	}
	public void setValue(ValueCardEnum value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Card [type=" + type + ", value=" + value.getValue() + "]";
	}
	
	
}
