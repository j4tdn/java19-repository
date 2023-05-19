package throw_throws_trycatch;

import java.io.File;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		
	}
	
	
	//pathname: D:\document\text.txt  --> Absolute path
	//pathname: data.txt --> relative path
	private static File createNewFile(String pathname) {
		
		if(pathname == null) {
			throw new IOException();
		}
		
		File file = new File(pathname);
		if(!file.exists()) {
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName() + " is created successful --> " + isCreated);
		}
		return file;
	}
}	
