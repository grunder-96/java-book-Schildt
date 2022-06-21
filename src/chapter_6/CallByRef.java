package chapter_6;

class Test1 {
	int a, b;
	
	Test1(int i, int j) {
		a = i;
		b = j;
	}
	
	void change(Test1 ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
		
}

class CallByRef {
	public static void main(String[] args) {
		Test1 ob = new Test1(15, 20);
		
		System.out.println("a и b перед вызовом: " + ob.a + " " + ob.b);
		
		ob.change(ob);
		
		System.out.println("a и b после вызова: " + ob.a + " " + ob.b);
	}
}
