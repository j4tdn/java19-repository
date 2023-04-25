package bean;

public class StudentUtils extends Student {
	public static Float averageScore(Student student) {
		return (student.getPracticeScore() + student.getTheoreticalScore())/2;
	}
}
