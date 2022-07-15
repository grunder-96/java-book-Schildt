package chapter_7;

class Sup {
	void who() {
		System.out.println("who() в Sup");
	}
}

class Sup1 extends Sup {
	void who() {
		System.out.println("who() в Sup1");
	}
}

class Sup2 extends Sup {
	void who() {
		System.out.println("who() в Sup2");
	}
}

public class DynDispDemo {
	public static void main(String[] args) {
		Sup superOb = new Sup();
		Sup1 superOb1 = new Sup1();
		Sup2 superOb2 = new Sup2();
		
		Sup supRef;
		
		supRef = superOb;
		supRef.who();
		
		supRef = superOb1;
		supRef.who();
		
		supRef = superOb2;
		supRef.who();
	}
}
