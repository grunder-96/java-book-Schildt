package chapter_8;

import chapter_9.QueueEmptyException;
import chapter_9.QueueFullException;

public interface ICharQ {
	
	void put(char ch) throws QueueFullException;
	char get() throws QueueEmptyException;

}
