package chapter_6;

class FailSoftArray {
	private int[] a;
	private int errval;
	
	public int length;
	
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}
	
	public int get(int index) {
		if (indexOK(index)) {
			return a[index];
		} else {
			return errval;
		}
	}
	
	public boolean put(int index, int val) {
		if (indexOK(index)) {
			a[index] = val;
			return true;
		} else {
			return false;
		}
	}
	
	private boolean indexOK(int index) {
		if (index >= 0 & index < length) {
			return true;
		} else {
			return false;
		}
	}
}

public class FSDemo {
	public static void main(String[] args) {
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;
		
		// Демонстрация корректной обработки ошибок
		System.out.println("Обработка ошибок без вывода отчета.");
		for (int i = 0; i < (fs.length * 2); i++) {
			fs.put(i, i * 10);
		}
		
		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -1) {
				System.out.print(x + " ");
			}
		}
		System.out.println("");
		
		
		// Обработка ошибок
		System.out.println("\nОбработка ошибок с выводом отчета");
		for (int i = 0; i < (fs.length * 2); i++) {
			if (!fs.put(i, i * 10)) {
				System.out.println("Индекс " + i + " вне допустимого диапазона");
			}
		}
		
		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -1) {
				System.out.print(x + " ");
			} else {
				System.out.println("Индекс " + i + " вне допустимого диапазона");
			}
		}
	}
}
