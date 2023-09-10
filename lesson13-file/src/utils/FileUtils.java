package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import functional.FileLine;

public class FileUtils {

	private FileUtils() {
	}

	public static <T extends Serializable> void writeObjects(File file, Collection<T> collection) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(collection);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("LOG >> Writing file " + file.getName() + "  is done!");
	}

	@SuppressWarnings("unchecked")
	public static <T extends Serializable> List<T> readObjects(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			return (List<T>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return Collections.emptyList();
	}

	public static List<String> readLines(Path path) {
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public static void writeLines(Path path, Iterable<String> iterable) {
		try {
			Files.write(path, iterable);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("LOG >> Writing file " + path.toString() + "  is done!");
	}

	public static <T extends FileLine> void writeLines(Path path, Collection<T> collection) {
		var iterable = collection.stream().map(T::toLine).collect(Collectors.toList());
		writeLines(path, iterable);
	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void open(Path path) {
		File file = path.toFile();
		open(file);
	}

	public static File createNewFile(String path) {
		File file = new File(path);
		String fileName = file.getAbsolutePath();

		if (file.exists()) {
			System.out.println("File " + fileName + "is already existed!");
		} else {
			File parent = file.getParentFile();
			if (!parent.exists()) {
				System.out.println("Directory " + parent.getAbsolutePath() + " is created successfully!");
				parent.mkdirs();
			}
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File " + fileName + " is created" + (isSuccess ? " successfully" : "failed"));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return file;
	}

	public static File createNewDir(String path) {
		File dir = new File(path);
		String dirName = dir.getAbsolutePath();

		if (!dir.exists()) {
			System.out.println("Dir " + dirName + " is already existed!");
		} else {
			boolean isSuccess = dir.mkdirs();
			System.out.println("Dir " + dirName + " is created" + (isSuccess ? " successfully" : "failed"));
		}
		return dir;
	}

}
