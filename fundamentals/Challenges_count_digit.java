package fundamentals;

import java.util.Scanner;

public class Challenges_count_digit {
public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		int N = input.nextInt();
		input.close();

		int count = 0;

		while (num > 0) {
			int rem = (int) num % 10;
			if (rem == N) {
				count++;
			}
			num = num / 10;
		}

		System.out.println(count);
}
}
