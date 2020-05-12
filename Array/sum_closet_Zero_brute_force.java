package Array;
import java.util.*;

public class sum_closet_Zero_brute_force {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = in.nextInt();
		}
		minAbsSumPair(array);

	}

	static void minAbsSumPair(int input[]) {

		Arrays.sort(input); 

		int local_sum = Integer.MAX_VALUE;
		int final_sum = Integer.MAX_VALUE;
		int lx = 0, ly = 0;

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				local_sum = Math.abs(input[i] + input[j]);

				if (local_sum < final_sum) {
					final_sum = local_sum;
					lx = i;
					ly = j;

				}

			}

		}

		System.out.print(input[lx] + " " + input[ly]);

	}
}
