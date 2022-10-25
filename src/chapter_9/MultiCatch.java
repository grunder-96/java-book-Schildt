package chapter_9;

public class MultiCatch {

	public static void main(String[] args) {
		int a = 88;
		int b = 0;
		int result;
		char[] chrs = {'A', 'B', 'C'};
		
		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0) {
					result = a / b;
				} else {
					chrs[5] = 'X';
				}
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Перехваченное исключение: " + e);
			}
		}
		System.out.println("После группового перехватчика исключений");
	}
}