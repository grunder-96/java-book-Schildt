package chapter_8;

class MyClass implements B{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Реализация метода meth1()");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Реализация метода meth2()");
	}

	@Override
	public void meth3() {
		// TODO Auto-generated method stub
		System.out.println("Реализация метода meth3()");
	}
	
	
}

class IFExtend {
	
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}
