package chapter_6;

class VarArgs2 {
	static void vaTest2(String msg, int ...v) {
		System.out.println(msg + v.length);
		System.out.println("Содержимое ");
		int count = 0;
		for (int val : v) {
			System.out.println("arg " + count + ": " + val);
			count++;
		}
	}
	
	public static void main(String[] args) {
		vaTest2("Один аргумент в массиве: ", 10);
		vaTest2("Три аргумента в массиве: ", 1, 2, 3);
		vaTest2("Отсутствуют аргументы в виде массива: ");
	}
}
