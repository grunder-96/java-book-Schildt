package chapter_9;

class ExcTestUTM {
	
	static void genException() {
		
		int[] nums = new int[4];
		System.out.println("До генерации исключения");
		nums[7] = 10;
		System.out.println("Эта строка не будет отображаться");
	}
}

class UseThrowableMethods {
	
	public static void main(String[] args) {
		
		try {
			ExcTestUTM.genException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Стандартное сообщение:");
			System.out.println(e);
			System.out.println("\nСтек вызовов: ");
			e.printStackTrace();
		}
		System.out.println("После инструкции catch");
	}
}
