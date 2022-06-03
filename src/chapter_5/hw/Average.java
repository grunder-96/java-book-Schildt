package chapter_5.hw;

public class Average {
	public static void main(String[] args) {
		double[] mass = {1.0, 454.2, 676.3, -5454.4, 0.0, 5454.1, 58.9, 9.7, 65.2, -978.6};
		double sum = 0;
		
		for (double val: mass) {
			sum += val;
		}
		System.out.println("Среднее арифметическое равно " + (sum / mass.length));
	}
}
