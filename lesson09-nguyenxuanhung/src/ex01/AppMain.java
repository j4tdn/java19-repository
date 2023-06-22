package ex01;

import java.util.Arrays;
import java.util.Optional;

public class AppMain {
	//con van de xuat hien 1 nguoi nhieu lan 
	public static void main(String[] args) {
		Student[] students = {
			    new Student(102, "Nam", ClassificationEnum.C),
			    new Student(103, "Bảo", ClassificationEnum.F),
			    new Student(104, "Hoàng", ClassificationEnum.D),
			    new Student(105, "Nguyên", ClassificationEnum.B),
			    new Student(107, "Vũ", ClassificationEnum.F),
			    new Student(109, "Lan", ClassificationEnum.A),
			    new Student(202, "Đạt", ClassificationEnum.C),
			    new Student(103, "Bảo", ClassificationEnum.F),
			    new Student(107, "Vũ", ClassificationEnum.C),
			    new Student(104, "Hoàng", ClassificationEnum.B)
			};
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021:");
		System.out.println(Arrays.toString(studentsWithGradeA(students)));
		System.out.println("======================");
		System.out.println("Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021:");
		System.out.println(Arrays.toString(studentsForRetake(students)));
	}
	
	private static Student[] studentsWithGradeA(Student[] students) {
		Student[] studentsWithGradeA = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.getClassification().equals(ClassificationEnum.A)) {
				studentsWithGradeA[running++] = student;
			}
		}
		return Arrays.copyOfRange(studentsWithGradeA, 0, running);
	}
	
	private static Student[] studentsForRetake(Student[] students) {
		//chua lam kip
		
//		Tuple[] tuples = new Tuple[students.length];
//		int runningTuple = 0;
//		for (Student student: students) {
//			Optional<Tuple> tupleOpt = get(tuples, student.getId(), runningTuple);
//			if (tupleOpt.isPresent()) {
//				// tăng số lần xuất hiện lên ++
//				tupleOpt.get().plus();
//			} else {
//				// đưa element vào tuples với count = 1
//				Tuple newTuple = new Tuple(student.getId(), 1);
//				tuples[runningTuple++] = newTuple;
//			}
//		}
//		tuples = Arrays.copyOfRange(tuples, 0, runningTuple);
		
		
		Student[] studentsForRetake = new Student[students.length];
		int running = 0;
		for (Student student : students) {
			if (student.getClassification().equals(ClassificationEnum.F)) {
				studentsForRetake[running++] = student;
			}
		}
		return Arrays.copyOfRange(studentsForRetake, 0, running);
	}
	
	private static Optional<Tuple> get(Tuple[] tuples, int element, int numberOfRealValues) {
		Tuple result = null;
		for (int i = 0; i < numberOfRealValues; i++) {
			Tuple tuple = tuples[i];
			if (tuple.getValue() == element) {
				result = tuple;
			}
		}
		return Optional.ofNullable(result);
	}
	
}
