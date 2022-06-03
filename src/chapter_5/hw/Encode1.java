package chapter_5.hw;

public class Encode1 {
	public static void main(String[] args) {
		String msg = "Это просто текст";
		String encmsg = "";
		String decmsg = "";
		String key = "Строкака";
		int val = 0;
		System.out.print("Исходное сообщение: ");
		System.out.println(msg);
		
		for (int i = 0; i < msg.length(); i++) {
			if (val == key.length() - 1) {
				val = 0;
			}
			encmsg += (char) (msg.charAt(i) ^ key.charAt(val));
			val++;
		}
		
		System.out.print("Зашифрованное сообщение: ");
		System.out.println(encmsg);
		
		val = 0;
		for (int i = 0; i < encmsg.length(); i++) {
			if (val == key.length() - 1) {
				val = 0;
			}
			decmsg += (char) (encmsg.charAt(i) ^ key.charAt(val));
			val++;
		}
		
		System.out.print("Расшифрованное сообщение: ");
		System.out.println(decmsg);
	}
}
