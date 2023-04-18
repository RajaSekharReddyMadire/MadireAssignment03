package Question3;

class Vehicle {
	
	public Vehicle getStart() {
		return new Vehicle();
	}
}
class Car extends Vehicle{
	@Override
	public Car getStart() {
		return new Car();
	}
}
class Main
{
	public static void main(String args[]) {
		Vehicle vehi = new Car();
		Car car = (Car)vehi.getStart();
		System.out.pritnln(car.getClass());
		
	}
}