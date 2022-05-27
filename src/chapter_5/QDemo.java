package chapter_5;


class Queue {
	char[] q;
	int putloc;
	int getloc;
	
	Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	// помещение символа в очередь
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println( " - очередь заполнена");
			return;
		}
		q[putloc++] = ch;
	}
	
	// помещение символа в очередь
	char get() {
		if (getloc == putloc) {
			System.out.println( " - очередь пуста");
			return (char) 0;
		}
		
		return q[getloc++];
		
	}
}

public class QDemo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println( "Использование очереди bigQ для сохранения алфавита");
		for (i = 0; i < 26; i++) {
			bigQ.put((char) ('A' + i));
		}
		
		System.out.print("Содержимое очереди bigQ: ");
		for (i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0) {
				System.out.print(ch);
			}
		}
		
		System.out.println("\n");
		
		System.out.println( "Использование очереди smallQ для генерации ошибок");
		for (i = 0; i < 5; i++) {
			System.out.print("попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		System.out.print("Содержимое очереди smallQ: ");
		for (i = 0; i < 5; i++) {
			ch = smallQ.get();
			if (ch != (char) 0) {
				System.out.print(ch);
			}
		}
	}
}
