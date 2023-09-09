package view.knowledge;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import common.Item;
import functionalInterface.TriFunction;

public class Ex04ConstructorReference {
	public static void main(String[] args) {
		Supplier<Item> sI1 = () -> new Item();
		TriFunction<Integer, String, BigDecimal, Item> sI2 = (Integer id, String name,
				BigDecimal salesPrice) -> new Item(id, name, salesPrice);
		sI1 = Ex04ConstructorReference::item;
		sI1 = Item::new;
		BiFunction<Integer, String, Item> bfItem3 = (Integer id, String name) -> new Item(id, name, BigDecimal.ONE);
		bfItem3 = Item::new;
	}
	private static Item item(){
		return new Item();
	}
	private static Item item(Integer id, String name, BigDecimal salesPrice){
		return new new Item(id, name, salesPrice);
	}
}
