package ex04.employeemanagement;

public class EmployeeManagementDemo {
	public static void main(String[] args) {
		Director dr = new Director("Nguyen Van A", "12/1/1970", 7.0f, 2.5f);
	    Manager mn = new Manager("Tran Thi B", "5/5/1987", 6.5f, 12);
	    Employee e1 = new Employee("Nguyen Thi C", "1/1/1999", 5.0f, "A");
	    Employee e2 = new Employee("Ho Thi D", "2/1/1997", 5.5f, "B");
	    
	    //Hien thi thong tin cac nhan su co trong cong ty
		System.out.println("Details of all employees ---> " + dr + "\n" + mn + "\n" + e1 + "\n" + e2 );
		System.out.println("=====(^-^)=====\n");
		
		//Tinh va in ra muc luong cua tung loai nhan su
		System.out.println("Employee salary:\n" + "e1 -->" + e1.salary() + "VND"+ "\n" + "e2 -->" + e2.salary() + "VND\n");
		System.out.println("Manager salary:\n" + mn.salary() + "VND\n");
		System.out.println("Director salary:\n" + dr.salary() + "VND");
		
	}
	
}
