package chapter_9;

public class NestTrys {
	
	public static void main(String[] args) {
		
		int[] numer = {4, 8, 16, 32, 68, 128, 256, 512};
		int[] denom = {2, 0, 4, 4, 0, 8};
		
		try {
			for (int i = 0; i < numer.length; i++) {
				try {
					System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i] / denom[i]);
				} catch (ArithmeticException e) {
					System.out.println("Попытка деления на ноль");
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Соответствующий элемент не найден");
			System.out.println("Фатальная ошибка - выполнение программы прервано!");
		}
	}
}