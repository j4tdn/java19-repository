package view;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Ex04CustomerView {
	private static CustomerService customerService;

	static {
		customerService = new CustomerServiceImpl();
	}

	public static void main(String[] args) {
		Customer customerToBeInserted = new Customer(6,"NVA", "abc@gmail.com", "QNam", "0941296714", "abc@123");
		
		customerService.save(customerToBeInserted);
		
		System.out.println("==== Finished ====");
		Customer customerLogin  = customerService.login("abc@gmail.com", "abc@123");
		
		System.out.println("==== Finished ====");
		System.out.println(customerLogin);
		
	}
}
