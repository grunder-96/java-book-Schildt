package chapter_3;

import java.util.Scanner;

public class Help {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Справка:");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.print("Выберите: ");
		char choice = Character.forDigit(scanner.nextInt(), 10);
		scanner.close();
		switch (choice) {
			case '1':
				System.out.println("инструкция if:\n");
				System.out.println("if (условие) инструкция");
				System.out.println("else инструкция");
				break;
			case '2':
				System.out.println("инструкция switch:\n");
				System.out.println("switch (выражение) {");
				System.out.println("	case константа:");
				System.out.println("		последовательность инструкций");
				System.out.println("		break;");
				System.out.println("	// ...");
				System.out.println("}");
				break;
			default:
				System.out.println("Запрос не найден.");
		}
	}
}
