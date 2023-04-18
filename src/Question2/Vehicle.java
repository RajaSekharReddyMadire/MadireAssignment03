package Question2;

public class Vehicle {	
	public void start(){
		System.out.println("Vehicle is started");
	}
	private void engine(){
		System.out.println("It has a 10000 horsepower");
	}
}
 class Car extends Vehicle
 {
	public void start() {
		System.out.println("Car is started");		
	}
	private void engine(){	
		System.out.println("It has 5000 horsepower");
	}
 }
 class Main{
	 
	 public static void main(String args[]) {
		 Car car = new Car();
		 car.engine();
	 }
 }

