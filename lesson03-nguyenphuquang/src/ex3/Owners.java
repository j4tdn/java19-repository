package ex3;

public class Owners {
	private String name;
	private int id;
	
	public Owners() {

	}

	public Owners(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "owners [name=" + name + ", id=" + id + "]";
	}

	
}
