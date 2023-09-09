package view.stream.practice;

import java.util.List;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex01FilterAndSlice {
	public static void main(String[] args) {
		var numbers = List.of(2, 8, 7, 8, 7, 18, 22, 22, 15);

		// 1. Distinct elements from numbers

		// Expected: 2 7 8 18 22 15

		var noneDupElements = numbers.stream()
		.distinct()
		.collect(Collectors.toList());

		// noneDupElements = numbers. stream().collect(Collectors.toSet());

		CollectionUtils.generate(
		"1. Distinct elements from numbers",
		noneDupElements

		);
		
		
	}
}
