package chapter_3;

public class SqrtRoot {
	public static void main(String[] args) {
		double num;
		double sroot;
		double rerr;
		for (num = 1.0; num < 100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Квадратный корень из " + num + " равен " + sroot);
			
			rerr =  num - (sroot * sroot);
			System.out.println("Ошибка округления: " + rerr);
			System.out.println();
		}
	}
}
