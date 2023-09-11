package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import file.ddl.$missing$;

public class FileUtils {
   public FileUtils() {
  }
   public static List<String> readLines(Path path){
	   try {
		   return Files.readAllLines(path);
		   
	   }catch (IOException e) {
		
	}
   }
   
   public static void write(Path path, Iterable<String> iterable) {
	   
   }
   
   public static void open(Path path) {
	   File file = path.toFile();
	   open(file);
   }
   
   public static File createNewFile(String path) {
	   File file = new File(path);
		String filename = file.getName();
		if(file.exists()) {
			System.out.println("File" + filename + "is existed already ");
		}else {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File");
			} catch (
			 ) {
				// TODO: handle exception
			}
		}
   }
   
   
   public static File createNewDir(String path) {
	   File dir = new File(path);
	   String dirName = dir.getAbsolutePath();
	   if(dir.exists()) {
		   System.out.println("Dir " + dirName + "is existed already");
	   }else {
		   boolean isSuccess = dir.mkdirs();
		   System.out.println("Dir " + );
	   }
   }
    return dir
   
}
