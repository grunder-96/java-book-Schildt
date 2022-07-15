package chapter_8;

public interface Series {
	
	int getNext(); //возврат следующего числа
	void reset();  //сброс
	void setStart(int x); //установка начального значения
}
