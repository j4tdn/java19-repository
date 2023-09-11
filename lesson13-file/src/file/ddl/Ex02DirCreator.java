package file.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex02DirCreator {
	
	private static final String path = "webapp";
	
	public static void main(String[] args) {
		File dir = FileUtils.createNewDir(path);
		System.out.println("dir properties --> " + dir.getName());
	}
}
