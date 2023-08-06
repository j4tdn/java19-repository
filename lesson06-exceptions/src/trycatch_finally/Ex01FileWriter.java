package trycatch_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01FileWriter {
	
	public static void main(String[] args) {
		// input       : id, name, age
		// file content: id, name, factor([age - initialAge(18)] * 2) 
		String[] employees = {
			"1, Le Na, 26", // 1, Le Na, (26-18) * 2
			"2, Le Teo, 19",
			"3, Le Ngoc, 45",
			"4, Le Nam, 24",
			"5, Le Van, 1o",
			"6, Le Phan, 3, 3",
			"7, Le Chu, 23",
			"8, Le Lai, 19"
		};
		System.out.println("*** ___ started ___ ***");
		File file = new File("data.txt");
		write(file, employees);
		open(file);
		System.out.println("*** ___ finished ___ ***");
	}
	
	private static void write(File file, String[] employees) {
		if (!file.exists()) {
			System.out.println("file " + file.getName() + " is not existed ...");
			return;
		}
		
		FileWriter fw = null;
		try {
			// open/connect file
			fw = new FileWriter(file);
			for (String employee: employees) {
				String[] tokens = employee.split(", ");
				
				// format
				String id = tokens[0];
				String name = tokens[1];
				int age = Integer.parseInt(tokens[2]); // NFE
				int factor = (age - 18) * 2;
				
				// write file with format
				String newLine = id + ", " + name + ", " + factor;
				fw.write(newLine + "\n");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			// save & close file --> should be called as always
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
