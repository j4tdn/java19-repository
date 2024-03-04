package view;

import java.util.Collection;
import java.util.stream.Collectors;

import persistence.entities.Item;
import persistence.entities.Size;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex03ItemView {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		selfGenerate("Câu 2A: Liệt kê các mặt hàng", itemService.getAll());
	}

	public static void selfGenerate(String prefix, Collection<Item> items) {
		System.out.println(prefix + " --> {");
		items.forEach(e -> {
			System.out.println("     " + e);
			System.out.println("     -- itemGroup -->  " + e.getGroup() + "\n");
			
			String sizes = e.getItemDetails().stream()
					.map(itd -> {
						Size size = itd.getSize();
						return size.getSize() + "-" + (size.getGender() == true ?"Nam" :"Nu");
					}).collect(Collectors.joining(" & "));
			System.out.println("     -- sizes -->  " + sizes + "\n");
		});

		System.out.println("}");
	}
}
