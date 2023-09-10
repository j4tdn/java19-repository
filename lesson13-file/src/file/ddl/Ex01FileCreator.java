package file.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {
	
	// path         : đường dẫn tương đối
	// absolute path: đường dẫn tuyệt đối
	
	private static final String path = "data" + File.separator +  "interview.txt";
	
	public static void main(String[] args) {

		File file = FileUtils.createNewFile(path);
		System.out.println("File Properties --> " + file.getName());
	
	}
}
