package Array;
import java.util.*;
import java.util.Scanner;

public class Arrays_target_Sum_Triplets_optimal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int t_sum = in.nextInt();
		Arrays.sort(arr); // sort to match output order

		for (int i = 0; i < N; i++) {
			int l = i + 1;
			int r = N - 1;
			while (l < r) {
				if ((arr[i] + (arr[l] + arr[r])) == t_sum) {
					System.out.println(arr[i] + ", " + arr[l] + " " + "and" + " " + arr[r]);
					l++; // key
					r--; // key
				}

				else if ((arr[i] + (arr[l] + arr[r])) > t_sum) {
					r--;
				} else
					l++;

			}
		}

	}
}
