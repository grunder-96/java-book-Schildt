package chapter_7;

class A1 {
	
	A1() {
		System.out.println("класс A");
	}
}

class B1 extends A1 {
	
	B1() {
		System.out.println("Класс B");
	}
}

class C1 extends B1 {
	
	C1() {
		System.out.println("Класс C");
	}
}

public class OrderOfConstruction {
	
	public static void main(String[] args) {
		C1 c = new C1();
	}
}
