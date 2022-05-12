package chapter_1.hw;
import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		int mass;
		int mass_moon;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите массу: ");
		mass = scanner.nextInt();
		mass_moon = (int) (0.17 * mass);
		System.out.println("масса на Луне равна " + mass_moon);
		scanner.close();
	}
}
