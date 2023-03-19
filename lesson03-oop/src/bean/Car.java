package bean;

public class Car {
	
	//scope: class
	public static String model;

	
	//attributes
	//scope: object
	private String id;
	private String color;
	private double price;

		
		//constructor rỗng Ctrl + enter
		public Car() {
			// TODO Auto-generated constructor stub
		}

		//constructor với thông số: Source --> genarate constructor using field
		public Car(String id, String color, double price) {
			//super();
			this.id = id;
			this.color = color;
			this.price = price;
		
		//
			
			
			//getter and setter
		
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getModel() {
			return model;
		}

		//public void setModel(String model) {
		//	this.model = model;
		//}
		
		// trường hợp model là private
		//public static void setModel(String model) {
		//	Car.model = model;
		//}

		
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Car [id=" + id + ", color=" + color + ", model=" + model + ", price=" + price + "]";
		}
		
		//sysout
		
		

		

}
