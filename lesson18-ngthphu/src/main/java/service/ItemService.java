package service;

import java.util.List;

import dto.ItemDto;

public interface ItemService {
	List<ItemDto> getAllByItemGroupId();
}
