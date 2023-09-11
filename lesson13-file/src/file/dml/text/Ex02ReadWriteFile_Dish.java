package file.dml.text;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.FileUtils;

public class Ex02ReadWriteFile_Dish {
	
	public static void main(String[] args) {
		
		File file = FileUtils.createNewFile("food/menu.txt");
		Path path = file.toPath();
		
		// Xử lý việc ghi/đọc file với danh sách các đối tượng dish
		List<Dish> menu = DataModel.mockDishes();
		FileUtils.writeLines(path, menu);
		
		// đọc file
		// List<String> --> List<T>
		
	}
}
