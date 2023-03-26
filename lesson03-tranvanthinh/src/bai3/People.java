package bai3;

public class People {
	private String id;
	private String name;
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
