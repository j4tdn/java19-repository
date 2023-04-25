package bean;

public class Student {
	private Integer id;
	private String name;
	private Float theoreticalScore;
	private Float practiceScore;
	
	public Student() {

	}

	public Student(Integer id, String name, Float theoreticalScore, Float practiceScore) {
		super();
		this.id = id;
		this.name = name;
		this.theoreticalScore = theoreticalScore;
		this.practiceScore = practiceScore;
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

	public Float getTheoreticalScore() {
		return theoreticalScore;
	}

	public void setTheoreticalScore(Float theoreticalScore) {
		this.theoreticalScore = theoreticalScore;
	}

	public Float getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(Float practiceScore) {
		this.practiceScore = practiceScore;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalScore=" + theoreticalScore + ", practiceScore="
				+ practiceScore + "]\n";
	}
	

}
