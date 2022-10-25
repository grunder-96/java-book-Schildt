package chapter_8;

import chapter_9.QueueEmptyException;
import chapter_9.QueueFullException;

class FixedQueue implements ICharQ {
	
	private char[] q;
	private int putloc, getloc;
	
	public FixedQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	@Override
	public void put(char ch) throws QueueFullException{
		// TODO Auto-generated method stub
//		if (putloc == q.length) {
//			System.out.println("Очередь заполнена");
//			return;
//		} else {
//			q[putloc++] = ch;
//		}
		if (putloc == q.length) {
			throw new QueueFullException(q.length);
		}
		q[putloc++] = ch;
	}

	@Override
	public char get() throws QueueEmptyException {
//		if (getloc == putloc) {
//			System.out.println("Очередь пуста");
//			return (char) 0;
//		}
		if (getloc == putloc) {
			throw new QueueEmptyException();
		}
		return q[getloc++];
	}
	
}

class CircleQueue implements ICharQ {
	private char[] q;
	private int putloc, getloc;
	
	public CircleQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}

	@Override
	public void put(char ch) {
		// TODO Auto-generated method stub
		if ((putloc + 1 == getloc) | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("Очередь заполнена");
			return;
		}
		q[putloc++] = ch;
		if (putloc == q.length) {
			putloc = 0;
		}
	}

	@Override
	public char get() {
		// TODO Auto-generated method stub
		if (getloc == putloc) {
			System.out.println("Очередь пуста");
			return (char) 0;
		}
		char ch = q[getloc++];
		if (getloc == q.length) {
			getloc = 0;
		}
		return ch;
	}
}

class DynQueue implements ICharQ {
	private char[] q;
	private int putloc, getloc;
	
	public DynQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	@Override
	public void put(char ch) {
		// TODO Auto-generated method stub
		if (putloc == q.length) {
			char[] t = new char[q.length * 2];
			for (int i = 0; i < q.length; i++) {
				t[i] = q[i];
			}
			q = t;
		}
		q[putloc++] = ch;
	}

	@Override
	public char get() {
		// TODO Auto-generated method stub
		if (getloc == putloc) {
			System.out.println("Очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}
	
	
}

//class CircleDynQueue implements ICharQ{
//	private char[] q;
//	private int putloc, getloc;
//	
//	public CircleDynQueue(int size) {
//		q = new char[size];
//		putloc = getloc = 0;
//	}
//
//	@Override
//	public void put(char ch) {
//		// TODO Auto-generated method stub
//		if ((putloc + 1 == getloc) | ((putloc == q.length - 1) & (getloc == 0))) {
//			char[] t = new char[q.length * 2];
//			for (int i = 0; i < q.length; i++) {
//				t[i] = q[i];
//			}
//			q = t;
//		}
//		q[putloc++] = ch;
//		if (putloc == q.length) {
//			putloc = 0;
//		}
//	}
//
//	@Override
//	public char get() {
//		// TODO Auto-generated method stub
//		if (getloc == putloc) {
//			System.out.println("Очередь пуста");
//			return (char) 0;
//		}
//		char ch = q[getloc++];
//		if (getloc == q.length - 1) {
//			getloc = 0;
//		}
//		return ch;
//	}
//	
//	
//}

public class IQDemo {
	
	public static void main(String[] args) {
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircleQueue q3 = new CircleQueue(10);
		//CircleDynQueue q4 = new CircleDynQueue(4);
		ICharQ IQ;
		int i;
		char ch;
				
		IQ = q1;
		// Помещение элементов в очередь фиксированного размера
		for (i = 0; i < 10; i++) {
			try {
				IQ.put((char) ('A' + i));
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.print("Содержимое фиксированной очереди: ");
		for (i = 0; i < 10; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch + " ");
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		
		IQ = q2;
		//Помещение элементов в динамическую очередь
		for (i = 0; i < 10; i++) {
			try {
				IQ.put((char) ('Z' - i));
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.print("Содержимое динамической очереди: ");
		for (i = 0; i < 10; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch + " ");
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		
		IQ = q3;
		//Помещение элементов в кольцевую очередь
		for (i = 0; i < 10; i++) {
			try {
				IQ.put((char) ('A' + i));
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.print("Содержимое кольцевой очереди: ");
		for (i = 0; i < 4; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch + " ");
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		
		//Помещение дополнительных символов в кольцую очередь
		for (i = 10; i < 20; i++) {
			try {
				IQ.put((char) ('A' + i));
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Отображение содержимого кольцевой очереди
		System.out.print("Содержимое кольцевой очереди: ");
		for (i = 0; i < 10; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch + " ");
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("\nСохранение и использование данных кольцевой очереди: ");
		
		//Помещение символов в кольцевую очередь с последующим их извлечением
		for (i = 0; i < 20; i++) {
			try {
				IQ.put((char) ('A' + i));
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ch = IQ.get();
				System.out.print(ch + " ");
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
