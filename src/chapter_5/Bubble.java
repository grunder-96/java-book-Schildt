package chapter_5;

public class Bubble {
	public static void main(String[] args) {
		int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int a, b, t;
		int size;
		
		size = nums.length;
		
		System.out.print("Array: ");
		for (int pos : nums) {
			System.out.print(pos + " ");
		}
		System.out.println("\n");
		for (a = 1; a < size; a++) {
			System.out.print("Проход " + a + ": \n\n");
			for (b = size - 1; b >= a; b--) {
				if (nums[b - 1] > nums[b]) {
					t = nums[b-1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
				for (int pos : nums) {
					System.out.print(pos + " ");
				}
				System.out.println("\n");
			}
		}
//		System.out.print("\nSorted array: ");
//		for (int pos : nums) {
//			System.out.print(pos + " ");
//		}
	}
}
