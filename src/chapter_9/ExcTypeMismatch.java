package chapter_9;

public class ExcTypeMismatch {
	
	public static void main(String[] args) {
		
		int[] nums = new int[4];
		
		try {
			nums[7] = 10;
			System.out.println("Эта строка не будет отображаться");
		} catch (ArithmeticException e) {
			System.err.println("Выход за пределы массива");
		}
		System.out.println("После инструкции catch");
	}
}
