package view;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class CustomerView {
	
	private static CustomerService customerService;
	
static {
		customerService = new CustomerServiceImpl();
}
	
public static void main(String[] args) {
	
//	Customer customerToBeInserted = new Customer(6, "ALEX", "rcd@gmail.com", "England", "0905025625", "alex1234");
//	customerService.save(customerToBeInserted);
	
	Customer cumtomer = customerService.login("rcd@gmail.com", "alex1234");
	
	if(cumtomer == null) {
		System.out.println("Email hoặc mật khẩu không chính xác ");
	}else {
		System.out.println("Đăng nhập thành công");
	}
	
}

}
