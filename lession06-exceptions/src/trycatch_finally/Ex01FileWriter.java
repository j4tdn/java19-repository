package trycatch_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// finally
// thread

// Thực hiện việc ghi, lưu nội dung vào file

public class Ex01FileWriter {
	
	
	
	public static void main(String[] args) {
		// id, name, age
		
		// id, name, factor ([age - initialAge(18)]*2)
		
		File file = new File("data.txt");
		
		
		String[] employees = {
			"1, Le Na, 24", 
			"2, Le Teo, 27", 
			"3, Le Ngoc, 26", 
			"4, Le Nam, 2o", 
			"5, Le Phan, 36", 
			"6, Le Chu, 46", 
			"7, Le Lai, 26", 
		};
		
		write(file, employees);
		open(file); // using default os editor
		
		System.out.println("finised");
	}
	
	private static void write(File file, String[] employees){
		if(!file.exists()) {
			System.out.println("File " + file.getName() + "is not existed...");
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for(String employee : employees) {
				String[] tokens = employee.split(", ");
				String id = tokens[0];
				String name = tokens[1];
				int factor = (Integer.parseInt(tokens[2])-18) *2;
				
				String newLine = id + ", " + name + ", " + factor;
				fw.write(newLine+"\n");
			}
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// save & close file
			// always be called
			if(fw != null) {
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
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
	}
}
