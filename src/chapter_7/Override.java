package chapter_7;

class A2 {
	
	int i;
	int j;
	
	A2(int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i и j : " + i + "," + j);
	}
}

class B2 extends A2 {
	
	int k;
	
	B2(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	void show(String s) {
		System.out.println(s + k);
	}
}

public class Override {
	
	public static void main(String[] args) {
		B2 subob = new B2(1, 2, 3);
		subob.show("k: ");
		subob.show();
	}
}
