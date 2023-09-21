package utils;

import java.util.List;
import java.util.stream.Collectors;

import bean.Store;

public class StoreUtils {
	private StoreUtils() {
	}

	public static Store getStoreById(List<Store> stores, Integer id) {
		return stores.stream()
					 .filter(s -> s.getStoreId() == id)
					 .collect(Collectors.toList()).get(0);
	}

}
