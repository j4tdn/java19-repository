package file.dml.serial;

import java.io.File;

import model.DataModel;
import utils.CollectionUtils;
import utils.FileUtils;

public class Ex01ReadWriteFile_Object_Serializable {
	
	public static void main(String[] args) {
		
		File file = FileUtils.createNewFile("data/secret.txt");
		var menu = DataModel.mockDishes();
		
		// write object
		FileUtils.writeObjects(file, menu);
		
		System.out.println("============================");
		
		// read object
		var serializedMenu = FileUtils.readObjects(file);
		CollectionUtils.generate("serializedMenu", serializedMenu);
		
	}
}
