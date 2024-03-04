package view;

import static utils.CollectionUtils.generate;

import java.util.List;

import persistence.entities.Item;
import service.ItemService;
import service.ItemServiceImpl;


public class Ex03ItemView {
	private static ItemService itemService;
	
	static {
		itemService = new  ItemServiceImpl();
	}
public static void main(String[] args) {
	generate("2A. Liệt kê các mặt hàng", itemService.getAll());
	
	
}

public static void selfGenerate(String prefix, List<Item> elements) {
	System.out.println(prefix + " -> {");
	
	elements.forEach(e -> {
		System.out.println("   " + e);
		System.out.println("   -> " + e.getGroup() + "\n");
	
	});
	
	System.out.println("}\n");
}
}
