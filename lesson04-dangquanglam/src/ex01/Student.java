package ex01;

public class Student {
	private Integer id;
	private String name;
	private Float diemLT;
	private Float diemTH;

	public Student() {

	}

	public Student(Integer id, String name, Float diemLT, Float diemTH) {
		super();
		this.id = id;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
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

	public Float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(Float diemLT) {
		this.diemLT = diemLT;
	}

	public Float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(Float diemTH) {
		this.diemTH = diemTH;
	}
	
	public float calAverage() {
		return (diemLT + diemTH) / 2.f;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", diemLT=" + diemLT + ", diemTH=" + diemTH + ", diemTB=" + this.calAverage() +"]\n";
	}

}
