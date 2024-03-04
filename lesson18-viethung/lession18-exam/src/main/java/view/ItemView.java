package view;

import static utils.CollectionUtils.generate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;

import persistence.entities.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		
		generate("Get Item by Date", itemService.getItemByDate(LocalDateTime.of(LocalDate.of(2023, 9, 7), LocalTime.of(0, 0))));
		generate("Top 3 best seller", itemService.topThreeItemBestSeller());
		
		selfGenerate("All Item of Item Group", itemService.getAll());
	}
	
	public static void selfGenerate(String prefix, Collection<Item> items) {
		System.out.println(prefix + " --> {");
		items.forEach(e -> {
			System.out.println("     " + e);
			System.out.println("     -- itemGroup -->  " + e.getGroup() + "\n");
		});

		System.out.println("}");
	}
}
