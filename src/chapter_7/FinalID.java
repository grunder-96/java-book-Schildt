package chapter_7;

class ErrorMsg {
	static final int OUTERR = 0;
	static final int INNER = 1;
	static final int DISKERR = 2;
	static final int INDEXERR = 3;
	
	String[] msgs = {
		"Ошибка вывода",	
		"Ошибка ввода",	
		"Отсутствует место на диске",	
		"Вывод индекса за границы диапазона",	
	};
	
	String getErrorMsg(int i) {
		if (i > 0 && i < msgs.length) {
			return msgs[i];
		} else {
			return "несуществующий код ошибки";
		}
	}
}

public class FinalID {
	
	public static void main(String[] args) {
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));
	}
}
