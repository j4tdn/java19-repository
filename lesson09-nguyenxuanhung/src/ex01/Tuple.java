package ex01;

public class Tuple {
	private int value; // giá trị của đối tượng
	private int count; // số lần xuất hiện của giá trị đó
	
	public Tuple() {
	}

	public Tuple(int value, int count) {
		this.value = value;
		this.count = count;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void plus() {
		count++;
	}
	
	public boolean isUnique() {
		return count == 1;
	}

	@Override
	public String toString() {
		return "Tuple [value=" + value + ", count=" + count + "]";
	}
}
