package Ex03;

public class TaxMoney {
	private User user;
	private Vehicle vehicle;
	
	public TaxMoney() {
	}

	public TaxMoney(User user, Vehicle vehicle) {
		this.user = user;
		this.vehicle = vehicle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return "Tên chủ xe : " + user.getName() + "\nLoại xe : " + vehicle.getTypeVehicle() +
				"\nDung tích : " + vehicle.getCapacity() + "\nTrị Giá : " + vehicle.getCost()
				+ "\nThuế phải nộp : " + TaxMoneyUtils.taxMoney(vehicle.getCost(), vehicle.getCapacity());
	}
	
	
}
