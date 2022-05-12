package chapter_3.hw;

public class SearchDot {
	public static void main(String[] args) throws java.io.IOException {
		int count = 0;
		char ch = (char) System.in.read();
		char ignore;
	while (ch != '.') {
		ch = (char) System.in.read();
		if (ch == ' ') count++;
	}	
//		 do {
//			 ch = (char) System.in.read();
//			 if (ch == ' ') count++;
////			 do {
////				 ignore = (char) System.in.read();
////			 } while (ignore != '\n');
//		 } while (ch != '.');
		 System.out.println("Количество пробелов равно " + count);
	}
}
