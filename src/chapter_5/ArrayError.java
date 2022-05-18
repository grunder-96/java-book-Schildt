package chapter_5;

public class ArrayError {
	public static void main(String[] args) {
		int[] sample = new int[10];
		int i;
		
		for (i = 0; i < 100; i++) {
			sample[i] = i;
			System.out.println(sample[i]);
		}
	}
}
