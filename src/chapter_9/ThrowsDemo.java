package chapter_9;

class ThrowsDemo {
	
	public static char prompt(String str) throws java.io.IOException {
		
		System.out.println(str + " : ");
		return (char) System.in.read();
	}	
	
	public static void main(String[] args) {
		
		char ch;
		
		try {
			ch = prompt("Введите букву");
		} catch (java.io.IOException e) {
			System.out.println("Произошло исключение ввода-вывода");
			ch = 'X';
		}
		System.out.println("Вы нажали клавишу " + ch);
	}
}
