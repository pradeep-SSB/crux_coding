package fundamentals;

import java.util.*;

public class Trailing_zeroes_from_factorial {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long fact = factorial(N);

//		System.out.println(fact);
		int count = 0;

		while (fact != 0) {
			int rem = (int) fact % 10;

			if (rem == 0) {
				count++;

			}
			fact = fact / 10;
		}
		System.out.println(count);

	}

	public static long factorial(long num) {
		long fact = 1;

		if (num == 0) {
			return 1;
		}

		else
			fact = num * factorial(num - 1);

		return fact;
	}
}
