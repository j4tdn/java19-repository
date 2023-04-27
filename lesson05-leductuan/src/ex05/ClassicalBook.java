package ex05;

public class ClassicalBook extends Book {
	
	private boolean isNew;
	
	public ClassicalBook() {
	}

	

	public ClassicalBook(int id, double dongia, String publisher, boolean isNew) {
		super(id, dongia, publisher);
		this.isNew = isNew;
	}



	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "{" +super.toString() + ", isNew = " + isNew +"}\n";
	}

	
	

}
