package chapter_4;

public class RetMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
		int range1;
		int range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		range1 = minivan.range();
		range2 = sportcar.range();
		
		System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на " + range1 + " миль");
		System.out.println("Спорткар может перевезти " + minivan.passengers + " пассажиров на " + range2 + " миль");
	}
}
