package Exercise;

import all.Personnel;

public class Ex04 {
public static void main(String[] args) {
	
	Personnel boss = new all.Boss("Huỳnh A", "19.05.1999", 18f, 9f);
	Personnel manager = new all.Manager("Nguyễn A", "05.05.1997", 15f, 8f, 7);
	Personnel staff = new all.Staff( "Trần C", "04.12.2001", 5f, 6f, "Backend");
	
	Personnel[] ps = {boss, manager, staff};
	for(Personnel all : ps) {
		System.out.println(all);
	}
		System.out.println("\n================================\n");
		
	System.out.println("The salary of " + boss.getName() + " is: " + boss.salary());
	System.out.println("The salary of " + manager.getName() + " is: " + manager.salary());
	System.out.println("The salary of " + staff.getName() + " is: " + staff.salary());
	
}
}
