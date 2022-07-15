package chapter_8;

public class ByTwos implements Series{
	
	int start;
	int prev;
	int val;
	
	ByTwos() {
		start = 0;
		val = 0;
		prev = -2;
	}
	
	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}
	
	public int getPrevious() {
		//return val == 0 ? 0 : val - 2; 
		return prev;
	}
	
	public void reset() {
		val = 0;
		start = 0;
		prev = -2;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		prev = x - 2;
	}
}
