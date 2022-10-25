package chapter_8;

import chapter_9.QueueEmptyException;
import chapter_9.QueueFullException;

public class QExcDemo {
	
	public static void main(String[] args) {
		
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;
		
		try {
			for (i = 0; i < 11; i++) {
				System.out.print("Попытка сохранения: " + (char) ('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
				
			}
			System.out.println();
		} catch (QueueFullException e) {
			System.out.println(e);
		}
		
		System.out.println();
		
		try {
			for (i = 0; i < 11; i++) {
				System.out.print("Получение очередного символа: ");
				ch = q.get();
				System.out.println(ch);
			}
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}
	}
}