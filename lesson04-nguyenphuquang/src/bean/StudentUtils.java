package bean;

public class StudentUtils extends Student {
	public Float averageScore() {
		return (this.getPracticeScore() + this.getTheoreticalScore())/2;
	}
}
