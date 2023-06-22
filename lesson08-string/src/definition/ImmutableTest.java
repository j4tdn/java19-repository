package definition;

public class ImmutableTest {
	private int number;
	private String text;
	
	public ImmutableTest() {
		
	}

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
	
	
}
