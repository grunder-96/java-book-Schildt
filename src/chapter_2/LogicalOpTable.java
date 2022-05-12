package chapter_2;

public class LogicalOpTable {
	public static void main(String[] args) {
		short p;
		short q;
				
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = 1; q = 1;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (Math.abs(p - 1)));
		
		p = 1; q = 0;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + Math.abs(p - 1));
		
		p = 0; q = 1;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + Math.abs(p - 1));
		
		p = 0; q = 0;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + Math.abs(p - 1));
		
	}
}
