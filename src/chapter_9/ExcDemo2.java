package chapter_9;

class ExcTest {
	
	static void genException() {
		
		int[] nums = new int[4];
		System.out.println("До генерации исключения");
		nums[7] = 10;
		System.out.println("Эта строка не будет отображаться");
	}
}

class ExcDemo2 {
	
	public static void main(String[] args) {
		
		try {
			ExcTest.genException();
		} catch (Exception e) {
			System.out.println("Выход за пределы массива");
		}
		System.out.println("После инструкции catch");
	}
}
