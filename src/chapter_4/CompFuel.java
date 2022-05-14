package chapter_4;

public class CompFuel {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		double gallons;
		int dist = 252;
				
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("Для преодоления " + dist + " миль минивену требуется " + gallons + " галлонов топлива");
		
		gallons = sportcar.fuelneeded(dist);
		System.out.println("Для преодоления " + dist + " миль спорткару требуется " + gallons + " галлонов топлива");
	}
}
