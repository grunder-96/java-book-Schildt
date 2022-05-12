package chapter_3.hw;

import java.io.IOException;

public class LetterCase {
	public static void main(String[] args) throws IOException {
		int count = 0;
		char ch;
		do {
			ch = (char) System.in.read();
			if ('A' <= ch & ch <= 'Z') {
				System.out.print((char) (ch + 32));
				count++;
			} else if ('a' <= ch & ch <= 'z') {
				System.out.print((char) (ch - 32));
				count++;
			} else {
				System.out.print(ch);
			}
		} while (ch != '.');
		System.out.print("\nКоличество перестановок " + count);
	}
}
