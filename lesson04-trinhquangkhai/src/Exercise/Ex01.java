package Exercise;

import java.util.Arrays;
import java.util.Scanner;

import all.Averagepoint;
import all.Information;

public class Ex01 {
	public static void main(String[] args) {
		Information sv1 = new Information(123, "Trịnh Quang Khải", 9f, 8f);
		Information sv2 = new Information(234, "Huỳnh B", 9f, 10f);
		Information sv3 = new Information();
		Student3(sv3);
		Information[] general = { sv1, sv2, sv3 };
		System.out.println("Sinh viên có điểm tb > 8.5: " + Arrays.toString(AveragePoint(general)));
		System.out.println("Sinh viên có điểm LT > TH : " + Arrays.toString(Compare(general)));
	}

	private static void Student3(Information student) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập id: ");
		String id = ip.nextLine();
		student.setId(Integer.valueOf(id));

		System.out.println("Nhập tên: ");
		String name = ip.nextLine();
		student.setName(name);

		System.out.println("Nhập điểm LT: ");
		String score1 = ip.nextLine();
		student.setLT(Float.valueOf(score1));

		System.out.println("Nhập điểm TH: ");
		String score2 = ip.nextLine();
		student.setTH(Float.valueOf(score2));

		System.out.println("Thông tin sinh viên: " + student);
	}

	private static Information[] AveragePoint(Information[] Points) {
		Information[] output = new Information[Points.length];
		int running = 0;
		for (Information score : Points) {
			if (Averagepoint.AvgPoint(score) > 8.5f) {
				 output[running++] = score;
			}

		}
		return Arrays.copyOfRange(output, 0, running);
	}

	private static Information[] Compare(Information[] bigger) {
		Information[] compare = new Information[bigger.length];
		int running = 0;
		for (Information points : bigger) {
			if (points.getLT() > points.getTH()) {
			 compare[running++] = points;
			}
		}
		return Arrays.copyOfRange(compare, 0, running);
	}
}
