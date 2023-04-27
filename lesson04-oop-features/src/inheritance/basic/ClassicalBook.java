package inheritance.basic;

public class ClassicalBook extends Book {
	private boolean isNew;
	
	public ClassicalBook() {
	}

	public ClassicalBook(int id, String name, String publisher, boolean isNew) {
		super(id, name, publisher);
		this.isNew = isNew;
	}

		
	

}
