package service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import persistence.dto.ItemByDateDto;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public interface ItemService {
	List<ItemByDateDto> getItemsByDate(LocalDate localDateTime);
	List<String> bai3(String year); 
}
