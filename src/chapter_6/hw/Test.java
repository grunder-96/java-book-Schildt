package chapter_6.hw;

class Test {
	int a;
	
	Test(int i) {
		a = i;
	}
	
	void swap(Test object1, Test object2) {
		int temp;
		temp = object1.a;
		object1.a = object2.a;
		object2.a = temp;
	}
	
	public static void main(String[] args) {
		Test obj1 = new Test(7); 
		Test obj2 = new Test(15);
		System.out.println("Значения до: " + obj1.a + " " + obj2.a);
		obj1.swap(obj1, obj2);
		System.out.println("Значения после: " + obj1.a + " " + obj2.a);
	}
}
