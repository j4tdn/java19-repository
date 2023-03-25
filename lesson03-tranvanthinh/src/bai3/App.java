package bai3;

public class App {
	public static void main(String[] args) {
		People p1 = new People("N01", "Thinh");
		People p2 = new People("N02", "Hue");
		People p3 = new People("N03", "Noo");
		
		Vehicle v1 = new Vehicle("V01", "Future Neo", 100, 35000000);
		Vehicle v2 = new Vehicle("V02", "Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("V03", "Landscape", 1500, 1000000000);
		
		Form f1 = new Form(p1, v1);
		Form f2 = new Form(p2, v2);
		Form f3 = new Form(p3, v3);
		System.out.printf("%-15s%-15s%-15s%-20s%s\n","Tên chủ xe","Loại xe","Dung tích", "Trị giá", "Thuế");
		System.out.println("=".repeat(75));
		System.out.printf("%-15s%-15s%-15d%-20.3f%.3f\n",f1.getPeople().getName(), f1.getVehicle().getType(), f1.getVehicle().getCapacity(), f1.getVehicle().getCost(), f1.taxCal());
		System.out.printf("%-15s%-15s%-15d%-20.3f%.3f\n",f2.getPeople().getName(), f2.getVehicle().getType(), f2.getVehicle().getCapacity(), f2.getVehicle().getCost(), f2.taxCal());
		System.out.printf("%-15s%-15s%-15d%-20.3f%.3f\n",f3.getPeople().getName(), f3.getVehicle().getType(), f3.getVehicle().getCapacity(), f3.getVehicle().getCost(), f3.taxCal());
	}
}
