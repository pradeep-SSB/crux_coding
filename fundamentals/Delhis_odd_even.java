package fundamentals;

import java.util.Scanner;

public class Delhis_odd_even {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		int sum = 0, add = 0, p = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		int i = 0, j = 0, x = 0;
		long[] tum = new long[1000];
		int n = N;

		while (N-- != 0) { // See how to take multiple input and process them in once, check imput format
			tum[p++] = input.nextLong();
		}

		while (n-- != 0) {
			int num = (int) tum[x++];

			while (num != 0) {
				int rem = (int) num % 10;
				if (rem % 2 == 0)
					a[i++] = rem;

				else
					b[j++] = rem;

				num /= 10;
			}

			for (int k = 0; k < a.length; k++) {
				sum += a[k];
			}

			for (int m = 0; m < b.length; m++) {
				add += b[m];
			}

			if ((sum % 4 == 0) || (add % 3 == 0))
				System.out.println("Yes");

			else
				System.out.println("No");
		}
		input.close();
	}
}
