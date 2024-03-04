package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import persistence.dto.ItemByDateDto;
import persistence.entities.Item;

public interface ItemDao {
	List<ItemByDateDto> getItemByDate(LocalDate localDate);
	List<String> bai3(String year);
}
