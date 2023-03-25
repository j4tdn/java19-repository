package ex03.vehicle;

public class App {
	public static void main(String[] args) {
    	  
      Owner o1 = new Owner("C1", "Nguyễn Thu Loan", 33, "HN");
      Owner o2 = new Owner("C2", "Lê Minh Tính", 34, "HCM" );
      Owner o3 = new Owner("C3", "Nguyễn Minh Triết", 44, "ĐN" );
	  
      Vehicle v1 = new Vehicle("X1", "Future Neo", 100, 35000000);
      Vehicle v2 = new Vehicle("X2", "Ford Ranger", 3000, 250000000);
      Vehicle v3 = new Vehicle("X2", "Landscape", 1500, 1000000000);

      System.out.println("Tên chủ xe"   +    "Loại xe"   +   "Dung tích"   +   "Trị giá"   +   "Thuế phải nộp");
      System.out.println(o1.getName() +  v1.getVehicleName() + v1.getDisplacement() + v1.getPrice() + v1.tax );
      System.out.println(o2.getName() +  v2.getVehicleName() + v2.getDisplacement() + v2.getPrice()+ v2.tax);
      System.out.println(o3.getName() +  v3.getVehicleName() + v3.getDisplacement() + v3.getPrice() + v3.tax);

      }
}
