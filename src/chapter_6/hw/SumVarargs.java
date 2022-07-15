package chapter_6.hw;

class SumVarargs {
	public static void main(String[] args) {
		System.out.println(sum(2, 34, 5, 14, 5));
	}
	
	static int sum(int... mass) {
		int sum = 0;
		for (int v : mass) {
			sum += v;
		}
		return sum;
	}
}
