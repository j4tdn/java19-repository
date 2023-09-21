package view.knowledge;

import java.math.BigDecimal;
import java.util.function.Supplier;

import bean.Item;
import funtionalInterface.TriFunction;

public class Ex04ContrustorReference {
	public static void main(String[] args) {
		
		// () -> T : supplier 
		Supplier<Item> sI1 = () -> new Item();
		sI1 = Ex04ContrustorReference::initEmptyItem;
		sI1 = Item::new;
		
		//(S, U, V) -> T
		TriFunction<Integer, String, BigDecimal, Item> sI2 = (Integer id, String name, BigDecimal saleDecimal) -> new Item(id, name, saleDecimal);
		sI2= Item::new;
	
	}
	
	private static Item initEmptyItem() {
		return new Item();
	}

}
