package chapter_4;

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range() {
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles) {
		return (double) (miles / mpg);
	}
}
public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		int range;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на " + range + " миль");
	}
}
