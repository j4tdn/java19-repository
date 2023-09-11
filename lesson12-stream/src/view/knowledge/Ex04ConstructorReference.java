package view.knowledge;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import bean.Item;
import functionalinterface.TriFunction;

public class Ex04ConstructorReference {
	
	public static void main(String[] args) {
		
		// Functional Interface
		
		// Implementation Class
		// Anonymous Class
		// Anonymous Function = Lambda Expression
		// --> OK
		
		// Method Reference
		// --> Lambda override abstract method địa nghĩa quá dài
		// --> Resue lamdba
		
		// Constructor Reference
		// --> Use constructor to return value
		// consider to use constructor || method reference reference
		
		// () -> T : Supplier<T>
		Supplier<Item> sI1 = () -> new Item();
		sI1 = Ex04ConstructorReference::initEmptyItem; // using method reference
		sI1 = Item::new; // using constructor reference
		
		// (S, U) -> R
		BiFunction<Integer, String, Item> bfI3 = (Integer id, String name) -> new Item(id, name);
		bfI3 = Item::new;
		
		// (S, U, V) -> R
		TriFunction<Integer, String, BigDecimal, Item> tI2 = (Integer id, String name, BigDecimal salesPrice) -> new Item(id, name, salesPrice);
		tI2 = Ex04ConstructorReference::initFullParamsItem;
		tI2 = Item::new;
	}
	
	private static Item initEmptyItem() {
		return new Item();
	}
	
	private static Item initFullParamsItem(Integer id, String name, BigDecimal salesPrice) {
		return new Item(id, name, salesPrice);
	}
}