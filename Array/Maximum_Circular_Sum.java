package Array;

import java.util.*;

public class Maximum_Circular_Sum {

	public static void main(String args[]) {// Brute force O(n*n)

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		while (T-- > 0) {
			int N = in.nextInt();

			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = in.nextInt();
			}

			int max_circular_sum = circular_sum(arr, N);
			System.out.println(max_circular_sum);
		}
	}

	public static int circular_sum(int[] arr, int n) {

		int global_sum = Integer.MIN_VALUE;
		int loop_sum = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int elements_count = n;
			int current_sum = 0;

			
			int j = i;

			while (elements_count-- > 0) {
				current_sum += arr[j++];

				if (current_sum > loop_sum) {
					loop_sum = current_sum;
				}

				if (j == n) // key
					j = 0;

			}

			if (loop_sum > global_sum)
				global_sum = loop_sum;

		}

		return global_sum;

	}

}
