package service;

import java.util.List;

import dao.CustomerDao;
import dao.HibernateCustomerDao;
import persistence.entities.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	private static CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao = new HibernateCustomerDao();
	}
	
	@Override
	public List<Customer> getCustomer() {
		return customerDao.getCustomer();
	}
}
