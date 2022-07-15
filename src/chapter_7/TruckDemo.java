package chapter_7;

class Vehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;
	
//	Vehicle() {
//		
//	}
	
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

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getFuelcap() {
		return fuelcap;
	}

	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
}

class Truck extends Vehicle {
	private int cargocap;
	
	Truck(int p, int f, int m, int c) {
		super(p, f, m);
		cargocap = c;
	}

	public int getCargo() {
		return cargocap;
	}

	public void putCargo(int cargocap) {
		this.cargocap = cargocap;
	}
	
	
}

public class TruckDemo {
	
	public static void main(String[] args) {
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		
		System.out.println("Грузовик может перевезти " + semi.getCargo() + " фунтов." );
		System.out.println("Для преодоления " + dist + " фунтов потребуется " + gallons + " галлонов топлива.\n");
		
		gallons = pickup.fuelneeded(dist);
		System.out.println("Пикап может перевезти " + pickup.getCargo() + " фунтов." );
		System.out.println("Для преодоления " + dist + " фунтов потребуется " + gallons + " галлонов топлива.\n");
	}
}
