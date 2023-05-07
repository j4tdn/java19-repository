package all;

public class Information {
	private Integer id;
	private String name;
	private Float LT;
	private Float TH;

	public Information() {
	}

	public Information(Integer id, String name, Float lT, Float tH) {
		super();
		this.id = id;
		this.name = name;
		LT = lT;
		TH = tH;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getLT() {
		return LT;
	}

	public void setLT(Float lT) {
		LT = lT;
	}

	public Float getTH() {
		return TH;
	}

	public void setTH(Float tH) {
		TH = tH;
	}

	@Override
	public String toString() {
		return "Information [id=" + id + ", name=" + name + ", LT=" + LT + ", TH=" + TH + "]";
	}

	
}
