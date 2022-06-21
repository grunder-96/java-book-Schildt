package chapter_6;

class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	
	static {
		System.out.println("Внутри статического блока\n");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}
	
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}

class SDemo3 {
	public static void main(String[] args) {
		StaticBlock ob = new StaticBlock("Внутри конструктора");
		System.out.println("Квадратный корень из 2 равен " + StaticBlock.rootOf2);
		System.out.println("Квадратный корень из 3 равен " + StaticBlock.rootOf3);
	}
}
