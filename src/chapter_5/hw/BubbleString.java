package chapter_5.hw;

public class BubbleString {
	public static void main(String[] args) {
		String[] nums = {"Проверочный", "Тренировочный и веселый", "Разборка Питерская", "космический корабль", "Украина це Европа", "Тестим"};
		int a, b;
		int size;
		String t;
		
		size = nums.length;
		
		System.out.print("Array: ");
		for (String pos : nums) {
			System.out.print(pos + " ");
		}
		System.out.println("\n");
		for (a = 1; a < size; a++) {
			System.out.print("Проход " + a + ": \n\n");
			for (b = size - 1; b >= a; b--) {
				if (nums[b - 1].length() > nums[b].length()) {
					t = nums[b-1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
				for (String pos : nums) {
					System.out.print(pos + " ");
				}
				System.out.println("\n");
			}
		}
//		System.out.print("\nSorted array: ");
//		for (String pos : nums) {
//			System.out.print(pos + " ");
//		}
	}
}