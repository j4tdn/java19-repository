package code300;

public class MyStruct {
public int numValue;
public int quantity;

public MyStruct() {
}

public MyStruct(int numValue, int quantity) {
	super();
	this.numValue = numValue;
	this.quantity = quantity;
}

public int getNumValue() {
	return numValue;
}

public void setNumValue(int numValue) {
	this.numValue = numValue;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Override
public String toString() {
	return "MyStruct [numValue=" + numValue + ", quantity=" + quantity + "]";
}


}
