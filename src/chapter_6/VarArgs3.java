package chapter_6;

class VarArgs3 {
	
	static void vaTest3(int ...v) {
		System.out.println("vaTest(int ...): " + "Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println("arg " + i + ": " + v[i]);
		}
		System.out.println();
	}
	
	static void vaTest3(boolean ...v) {
		System.out.println("vaTest(boolean ...): " + "Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println("arg " + i + ": " + v[i]);
		}
		System.out.println();
	}
	
	static void vaTest3(String msg, int ...v) {
		System.out.println("vaTest(String, int ...v): " + msg + v.length);
		System.out.println("Содержимое: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println("arg " + i + ": " + v[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest3(1, 2, 3);
		vaTest3("Тестирование: ", 10, 20);
		vaTest3(true, false, false);
	}


}
