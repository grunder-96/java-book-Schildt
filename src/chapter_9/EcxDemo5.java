package chapter_9;

public class EcxDemo5 {
	
	public static void main(String[] args) {
		
		int[] numer = {4, 8, 16, 32, 68, 128, 256, 512};
		int[] denom = {2, 0, 4, 4, 0, 8};
		
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Соответствующий элемент не найлен");
			} catch (Throwable e) {
				System.out.println("Throwable");
			}
		}
	}
}
