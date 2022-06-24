package chapter_6;

class QuickSort {
	static void qsort(char[] items) {
		qs(items, 0, items.length - 1);
	}
	
	private static void qs(char[] items, int left, int right) {
		int i, j;
		char x, y;
		
		i = left;
		j = right;
		x = items[(left + right) / 2];
		
		do {
			System.out.println((items[i] < x) && (i < right));
			System.out.println((items[i] < x));
			System.out.println((i < right));
			System.out.println(items[i]);
			System.out.println(items[(left + right) / 2]);
			System.out.println('p' < 'j');
			while ((items[i] < x) && (i < right)) {
				System.out.print("i в while было " + i + ",");
				i++;
				System.out.println(" а стало " + i + ";");
			}
			while ((x < items[j]) && (j > left)) {
				System.out.print("j в while было " + j + ",");
				j--;
				System.out.println(" а стало " + j + ";");
			}
			
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
				System.out.println("Блок if: значение i - " + i + ", значение j - " + j);
				for (char val : items) {
					System.out.print(val);
				}
				System.out.println("\n");
			}
		} while (i <= j);
		
		if (left < j) {
			System.out.println("Запуск qs с параметрами " + left + "," + j);
			qs(items, left, j);
		}
		
		if (i < right) {
			System.out.println("Запуск qs с параметрами " + i + "," + right);
			qs(items, i, right);
		}
	}
}

class QSDemo {
	public static void main(String[] args) {
		char[] a = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
		int i;
		
		System.out.print("Исходный массив: ");
		
		for (char val : a) {
			System.out.print(val);
		}
		System.out.println();
		QuickSort.qsort(a);
		
		System.out.print("Отсортированный массив: ");

		for (char val : a) {
			System.out.print(val);
		}
	}
}
