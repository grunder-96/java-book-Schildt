package chapter_8;

public class SeriesDemo {
	
	public static void main(String[] args) {
//		ByTwos ob = new ByTwos();
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Следующее значение: " + ob.getNext());
//		}
//		
//		System.out.println("\nПредыдущее значение: " + ob.getPrevious());
//		
//		System.out.println("\nСброс\n");
//		ob.reset();
//				
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Следующее значение: " + ob.getNext());
//		}
//		
//		System.out.println("\nНачальное значение: 100");
//		ob.setStart(100);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Следующее значение: " + ob.getNext());
//		}
//		System.out.println("\nПредыдущее значение:" + ob.getPrevious());
///////////////////////////////////////////////////////////////////////////////////////////////////////////		
		ByThrees ob = new ByThrees();
		for (int i = 0; i < 5; i++) {
			System.out.println("Следующее значение: " + ob.getNext());
		}
		
		System.out.println("\nПредыдущее значение: " + ob.getPrevious());
		
		System.out.println("\nСброс\n");
		ob.reset();
				
		for (int i = 0; i < 5; i++) {
			System.out.println("Следующее значение: " + ob.getNext());
		}
		
		System.out.println("\nНачальное значение: 100");
		ob.setStart(100);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Следующее значение: " + ob.getNext());
		}
		System.out.println("\nПредыдущее значение:" + ob.getPrevious());
	}
}
