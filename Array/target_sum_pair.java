package Array;

import java.util.Arrays;
import java.util.Scanner;

public class target_sum_pair {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] arr = new int[N];
		int sum = in.nextInt(); // sum

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

//	brute_force(arr, sum,N); // works on sorted or unsorted
		optimize1(arr, sum, N); // works on sorted only
	}

	public static void brute_force(int[] arr, int sum, int N) { //
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (sum == (arr[i] + arr[j]))
					System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}

	public static void optimize1(int[] arr, int sum, int N) { // first sort the array
		Arrays.sort(arr);   // first sort it
		int l = 0;
		int r = N - 1;
		while (l < r) { // NOTE: l<r not l<=r
			if (arr[l] + arr[r] == sum) {
				System.out.println(arr[l] + " " + arr[r]);
				l++;
				r--;
			}
			else if (arr[l] + arr[r] < sum) {
				l++;

			} else
				r--;
}}}
