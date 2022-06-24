package chapter_6.hw;

class StackC {
	private char[] q;
	int index; 
	
	StackC(int size) {
		q = new char[size];
		index = 0;
	}
		
	void push(char ch) {
		if (index == q.length) {
			System.out.println( " - стек заполнен");
			return;
		}
		q[index++] = ch;
	}
	
	char pop() {
		if (index == 0) {
			System.out.println( " - стек пуст");
			return (char) 0;
		}
		index --;
		return q[index];
	}
}

public class Stack {
	public static void main(String[] args) {
		StackC q1 = new StackC(5);	
		char[] name = {'T', 'O', 'M', 'Z', 'G', 'T', 'A', 'V', 'U'};
		
		for (int i = 0; i < 7; i++) {
			q1.push(name[i]);
		}
		System.out.println();
		for (int i = 0; i < 7; i++) {
			char symb = q1.pop();
			System.out.print(symb);
		}
	}
}
