package inheritance.basic;

public class ClassicalBook extends Book{
	
	private boolean isNew;
	
	public ClassicalBook() {
	}
	
	public ClassicalBook(int id, String name, String publisher,boolean isNew) {
		//super trong th này dùng để gọi đến hàm khởi tạo của lớp cha
		super(id, name, publisher);
		this.isNew = isNew;
	}

	public ClassicalBook(boolean isNew) {
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
