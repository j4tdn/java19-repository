package trycatch_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Thuc hine viec ghi, luu nd vao file
public class Ex01FileWriter {
	public static void main(String[] args) {

		// id, name, age
		// id, name, factor([age - initialAge(18)]*2)
		File file = new File("data.txt");
		String[] employees = { 
				"1, Le Na, 26", 
				"2, Le Teo, 19",
				"3, Le Ngoc, 44", 
				"4, Le Hiem, 55", 
				"5, Le Nam, 43",
				"6, Le Chu, 27,5",
				"7, Le Na, 16", 
				"8, Le Lai, 22", 
				};

		write(file, employees);
		open(file);
	}

	private static void write(File file, String[] employees) {
		if (!file.exists()) {
			System.out.println("file " + file.getName() + " is not existed...");
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
				int factor = (age - 18) * 2;
				// write file
				String newLine = id + ", " + name + ", " + factor;
				fw.write(newLine + "\n");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			// always be called
			// save & close file
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	private static void open(File file) {
		if (file.exists()) {
			try {
				Desktop.getDesktop().open(file);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
