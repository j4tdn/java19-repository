package service;

import persistence.entities.Sale;

import java.util.*;

public interface ShoppingService{
    List<Sale> findBySaleDateOrderByCreatedTimeDescIdAsc(Date saleDate);
    List<Object[]> getInventorySummary();
    public List<String> getTop3BestSellingItems(int year);
    public List<Object[]> getItemDetails();
}
