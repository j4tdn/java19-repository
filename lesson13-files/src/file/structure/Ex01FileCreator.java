package file.structure;

import java.io.File;

public class Ex01FileCreator {
	
	private static final String pathName = "content.txt";
	
	public static void main(String[] args) {
		System.out.println("***___START MAIN___***");
		File file = new File(pathName);
		
		if(!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File " + file.getName() + " is created successful --> " + isSuccess);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("***___STOP MAIN___***");
	}
}
