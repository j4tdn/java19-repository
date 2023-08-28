package view.knowledge;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import common.Item;
import functionainterface.TriFunction;

public class Ex04ConstructorReference {
public static void main(String[] args) {
	Supplier<Item> sI1 = () -> new Item();
	sI1 = Ex04ConstructorReference::initItem;
	sI1 = Item::new; 
	
	BiFunction<Integer, String, Item> bfI3 = (Integer id, String name) -> new Item(id,name);
	bfI3 = Item::new;
	TriFunction<Integer, String, BigDecimal, Item> tI2 = (Integer id, String name, BigDecimal salesPrice) -> new Item(id, name, salesPrice);
	tI2 = Ex04ConstructorReference::initFullParasItem;
	tI2 = Item::new;
	
	
	
}
private static Item initItem() {
	return new Item();
}
private static Item initFullParasItem(Integer id, String name,BigDecimal salesPrice ) {
	return new Item(id, name, salesPrice);
}
}
