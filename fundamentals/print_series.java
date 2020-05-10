//A number (N1)
//A number (N2)
//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

package fundamentals; 
import java.util.Scanner;

public class print_series {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N1 = input.nextInt();
		int N2 = input.nextInt();
		input.close();
		int i = 1, num = 0, count = 0;

		while (N1 != count) {
			num = 3 * i + 2; // try this-> num = 3 * (i++) + 2; and escape i++
			i++;
			if (num % N2 != 0) {
				System.out.println(num);
				count++;
			}
		}
	}
}
 