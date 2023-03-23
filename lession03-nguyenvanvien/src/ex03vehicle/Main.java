package ex03vehicle;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Ten chu xe" , "Loai xe" , "Dung tich" , "Tri gia" , "Thue phai nop");
		System.out.println("===============================================================================================");
		for(Vehicle ve : fetchData()) {
			ve.show();
		}
	}
	
	private static Vehicle[] fetchData(){
		return new Vehicle[] {
				new Vehicle("Nguyen van a", "Future Neo", 100, 350000),
				new Vehicle("Nguyen van b", "Ford Ranger", 3000, 250000),
				new Vehicle("Nguyen van c", "Landscape", 1500, 10000)
		};
	}
}
