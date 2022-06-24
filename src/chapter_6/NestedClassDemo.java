package chapter_6;

class Outer {
	int[] nums;
	
	Outer(int[] n) {
		nums = n;
	}
	
	void Analyze() {
		Inner inOb = new Inner();
		System.out.println("Минимум: " + inOb.min());
		System.out.println("Максимум: " + inOb.max());
		System.out.println("Среднее: " + inOb.avg());
	}
	
	//Внутренний класс
	class Inner {
		
		int min() {
			int m = nums[0];
			
			for (int var : nums) {
				if (var < m) {
					m = var;
				}
			}
			return m;
		}
		
		int max() {
			int m = nums[0];
			
			for (int var : nums) {
				if (var > m) {
					m = var;
				}
			}
			return m;
		}
		
		int avg() {
			int sum = 0;
			for (int var : nums) {
				sum += var;
			}
			return sum / nums.length;
		}
	}
}


class NestedClassDemo {
	public static void main(String[] args) {
		int[] x = {3, 2, 1, 5, 6, 9, 7, 8};
		Outer outOb = new Outer(x);
		outOb.Analyze();
	}
}
