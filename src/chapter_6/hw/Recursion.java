package chapter_6.hw;

class Recursion {
	static String str = "Тестовая строка";
	
	public static void main(String[] args) {
		Recursion.showVV(0);
	}
	
	static void showVV(int index) {
		if (index != str.length() - 1) {
			showVV(index + 1);
			System.out.print(str.charAt(index));
		}
	}
}
