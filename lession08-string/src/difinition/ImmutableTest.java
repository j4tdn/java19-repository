package difinition;

public class ImmutableTest {
	private final int number;
	private final String text;
	

	public ImmutableTest(int number, String text) {
		this.number = number;
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public int getNumber() {
		return number;
	}



	@Override
	public String toString() {
		return "ImmutableTest [number=" + number + ", text=" + text + "]";
	}
	
	
	
	
}
