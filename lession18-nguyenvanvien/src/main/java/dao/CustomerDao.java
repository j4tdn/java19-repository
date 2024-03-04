package dao;

import java.util.List;

import persistence.entities.Customer;

public interface CustomerDao {
	List<Customer> getCustomer();
}
