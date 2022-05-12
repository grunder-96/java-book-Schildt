/* Видоизмените программу, созданную в упражнении 1.2, таким образом, чтобы она выводила таблицу перевода дюймов в метры. Выведите значения
 * длины до 12 футов через каждый дюйм. После каждых 12 дюймов выведите пустую строку.(Один метр приблизительно равен 39.37 дюйма.)
 */

package chapter_1.hw;

public class InchToMeter {
	public static void main(String[] args) {
		double inches;
		double meters;
		int counter;
		counter = 0;
		for (inches = 1; inches <= 144; inches++) {
			meters = inches / 39.37;
			System.out.println(inches + " дюймам соответствует " + meters + " метров");
			counter++;
			if (counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
		
	}
}
