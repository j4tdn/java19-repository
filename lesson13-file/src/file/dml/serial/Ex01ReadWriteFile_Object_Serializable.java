package file.dml.serial;

import java.io.File;

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
		
		// BT --> 12
		
		// BT --> 13
		
		// Review Java
		
		// --> Ôn tập về Java + Interview
		
		// --> Java Test
		
		
		// Failed: Học lại lớp khác
		
		// Passed: Database
		
	}
}
