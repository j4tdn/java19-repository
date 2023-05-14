package trycatch_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.management.Descriptor;
//thuc hien ghi noi dung vao file
public class Ex01FileWriter {
	public static void main(String[] args) {
		//id, name, age
		//id, name, factor[(age - initialAge(18)]*2
		
		File file = new File("data.txt");
		
		String[] employees = {
				"1, a, 21",
				"2, b, 19",
				"3, c, 32",
				"4, d, 43",
				"5, e, 23",
				"6, f, a",
		};
		
		write(file, employees);
		open(file);//using default as editor
		
		System.out.println("*******finished********");
	}
	
	private static void write(File file, String[] employees) {
		if (!file.exists()) {
			System.out.println("file " + file.getName() + " is not existed ...");
			return;
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				String id = tokens[0];
				String name = tokens[1];
				int age = Integer.parseInt(tokens[2]);//NumberFormatException
				
				int factor = (age - 18) * 2 ;
				
				//write file
				String newLine = id + ", " + name + ", " + factor;
				fw.write(newLine + "\n");
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			//always be called
			// save & close
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
