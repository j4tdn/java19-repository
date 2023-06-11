package trycatch_finally;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//finally
//thread
//thuc hien viec ghi, luu noi dung vao file
public class Ex01FileWriter {
	public static void main(String[] args) {
		// id,, name, age

		// id, name, factor([age - initialAge(18)] * 2)
		File file = new File("data.txt");
		String[] employees = { "1, A, 20", "2, b, 21", "3, c, 22", "4, d, 23", "5, e, 24", "6, f, 25", "7, g, 26",

		};
		write(file, employees);
		open(file);
		System.out.println("-------finished--------");
	}

	private static void write(File file, String[] employees) {
		if (!file.exists()) {
			System.out.println("file " + file.getName() + "is not existed ...");
			return;
		}

		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				String id = tokens[0];
				String name = tokens[1];
				int age = Integer.parseInt(tokens[2]);

				double factor = (age - 18) * 2;
				String newLine = id + ", " + name + ", " + factor;
				fw.write(newLine + "\n");
			}

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			// save & close
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void open(File file) {
		if(file.exists()) {
			
		}
	}
}
