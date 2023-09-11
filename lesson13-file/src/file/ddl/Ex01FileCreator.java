package file.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {
	//path: duong dan tuong doi
	//absolute path: duong dan tuyet doi
	
  private static final String path = "data" + File.separator + "interview.txt";
	
  public static void main(String[] args) {
	
	  File file = FileUtils.createNewFile(path);
	  System.out.println("File properties -->" file.getName());
	
	
  }
}
