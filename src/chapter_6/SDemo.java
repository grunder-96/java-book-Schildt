package chapter_6;

class StaticDemo {
	int x;
	static int y;
	
	int sum() {
		return x + y;
	}
}

class SDemo {
	public static void main(String[] args) {
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		
		ob1.x = 10;
		ob2.x = 20;
		
		StaticDemo.y = 19;
		System.out.print(ob1.sum() + " ");
		System.out.println(ob2.sum());
		
		StaticDemo.y = 100;
		System.out.print(ob1.sum() + " ");
		System.out.println(ob2.sum());
	}
}
