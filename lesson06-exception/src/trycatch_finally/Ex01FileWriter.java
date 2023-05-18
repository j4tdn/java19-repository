package trycatch_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01FileWriter {
	public static void main(String[] args) {
		File file = new File("data.txt");
		
		String[] employees = {
				"1, Mr A, 20",
				"2, Mr B, 25",
				"3, Mr C, 23",
				"4, Mr D, 29",
				"5, Mr E, 27",
				"6, Mr F, 22"
		};
		write(file, employees);
		open(file); // using default os editor
		
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
				//a, b, c".split(", ") --> new String[]{"a", "b", "c"}
				String[] tokens = employee.split(", ");
				String id = tokens[0];
				String name = tokens[1];
				int age = Integer.parseInt(tokens[2]); // NFE
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
