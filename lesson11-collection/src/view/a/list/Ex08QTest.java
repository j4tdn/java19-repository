package view.a.list;

import java.util.List;

public class Ex08QTest {
	public static void main(String[] args) {
		final List<Integer> POTTED_PLANTS_FAMILIES = List.of(10, 30, 40);
		
		// POTTED_PLANTS_FAMILIES.add(20);
		// POTTED_PLANTS_FAMILIES.get(20);
		POTTED_PLANTS_FAMILIES.set(0, 20);
	}
}
