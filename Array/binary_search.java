package Array;
import java.util.Scanner;

public class binary_search {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long[] arr = taking_input();
		long el = in.nextLong();

		System.out.println(binary_search(arr, el));

	}

	public static long[] taking_input() {
		long N = in.nextLong();
		long[] arr = new long[(int) N];

		for (long i = 0; i < N; i++) {
			arr[(int) i] = in.nextLong();
		}
		return arr;
	}

	public static long binary_search(long[] arr, long el) {
		long L = 0;
		long R = arr.length - 1;
		while (L <= R) {
			long mid = (L + R) / 2;

			if (arr[(int) mid] > el) {
				R = mid - 1;
			} else if (arr[(int) mid] < el) {
				L = mid + 1;
			} else
				return mid;
		}
		return -1;
	}
}
