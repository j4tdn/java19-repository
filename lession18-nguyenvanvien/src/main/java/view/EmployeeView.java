package view;

import static utils.CollectionUtils.generate;

import service.CustomerService;
import service.CustomerServiceImpl;

public class EmployeeView {
//	ALTER TABLE employee
//	ADD COLUMN salary DECIMAL(10,2),
//	ADD COLUMN managerId INT;

	private static CustomerService customerService;

	static {
		customerService = new CustomerServiceImpl();
	}

	public static void main(String[] args) {
		generate("Employee with higher salary thay manager", customerService.getCustomer());
	}
}
