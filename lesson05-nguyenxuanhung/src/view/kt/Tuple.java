package view.kt;

public class Tuple {
	private int value;
	private int cout;

	public Tuple() {
		// TODO Auto-generated constructor stub
	}

	public Tuple(int value, int cout) {
		super();
		this.value = value;
		this.cout = cout;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public void plus() {
		setCout(getCout() + 1);
	}
	public boolean isUnique() {
		return cout == 1;
	}
	@Override
	public String toString() {
		return "Tuple [value=" + value + ", cout=" + cout + "]";
	}

}
