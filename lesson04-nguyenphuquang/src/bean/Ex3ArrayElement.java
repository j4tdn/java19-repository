package bean;

public class Ex3ArrayElement {
	private int row;
	private int collum;
	private int value;
	
	public Ex3ArrayElement() {
		// TODO Auto-generated constructor stub
	}

	public Ex3ArrayElement(int row, int collum, int value) {
		super();
		this.row = row;
		this.collum = collum;
		this.value = value;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollum() {
		return collum;
	}

	public void setCollum(int collum) {
		this.collum = collum;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Ex3ArrayElement [row=" + row + ", collum=" + collum + ", value=" + value + "]";
	}
	
	
}
