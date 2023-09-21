package file.dml.serial;

import java.io.File;
import java.util.List;

import model.DataModel;
import utils.CollectionUtils;
import utils.FileUtils;

public class Ex01ReadWriteFile_Object_Serializable {
	
	public static void main(String[] args) {
		
		File file = FileUtils.createNewFile("data/secret.txt");
		var menu = DataModel.mockDishes();
		
		// process write objects
		FileUtils.writeObjects(file, menu);
		
		System.out.println("\n=======================\n");
		
		// process read objects
		var serializedMenu = FileUtils.readObjects(file);
		CollectionUtils.generate("serializedMenu", serializedMenu);
		
		
	}
	
	// gene
	
	private static <E> void test(List<?> e) {
		System.out.println(e);
	}
}
