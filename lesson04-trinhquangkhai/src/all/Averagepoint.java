package all;

public class Averagepoint extends Information{
	public static float AvgPoint(Information student ) {
		return ((student.getLT() + student.getTH())/2);
	}

}
