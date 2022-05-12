package chapter_2;

public class CastDemo {
	public static void main(String args[]) {
		double x;
		double y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		i = (int) (x / y);
		System.out.println(i);
		
		i = 100;
		b = (byte) i;
		System.out.println(i);
		
		i = 257;
		b = (byte) i;
		System.out.println(i);
		
		i = 88;
		ch = (char) i;
		System.out.println(ch);
	}
}
