package exercise3;

import java.util.Scanner;

public class Vehicle {
	private String owner;
	private String vehicelName;
	private int capacity;
	private double price;

	public Vehicle() {

	}

	public Vehicle(String owner, String vehicelName, int capacity, double price) {
		this.owner = owner;
		this.vehicelName = vehicelName;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getVehicelName() {
		return vehicelName;
	}

	public void setVehicelName(String vehicelName) {
		this.vehicelName = vehicelName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double tax() {
		if (this.capacity < 100)
			return price * 0.01;
		if (100 <= this.capacity && this.capacity <= 200)
			return price * 0.03;
		return price * 0.05;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("- Enter owner name: ");
		this.owner = sc.nextLine();
		System.out.print("- Enter vehicle name: ");
		this.vehicelName = sc.nextLine();
		System.out.print("- Enter capacity: ");
		this.capacity = sc.nextInt();
		System.out.print("- Enter price: ");
		this.price = sc.nextDouble();
		System.out.println("-----");
	}

	public void output() {
		System.out.printf("%-25s%-20s%10d%30.2f%20.2f\n",this.owner,this.vehicelName,this.capacity, this.price, tax());
	}
	
	
}
