package defination;

public class ImmutableTest {
	private final int number;
	private final String text;

	public ImmutableTest(int number, String text) {
		this.number = number;
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "ImmultableTest [number=" + number + ", text=" + text + "]";
	}

}
