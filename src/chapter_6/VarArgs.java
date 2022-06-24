package chapter_6;

class VarArgs {
	static void vaTest(int ...v) {
		System.out.println("Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");
		int count = 0;
		for (int a : v) {
			System.out.println("arg " + count + ": " + a);
			count++;
		}
	}
	
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}
