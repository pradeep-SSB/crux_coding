package fundamentals;
import java.util.Scanner;  // test case-4 not runnig on hackerblock ide but eclipse -okk

public class Prateek_Loves_Candy {
	public static void main(String args[]) {
		long[] arr = new long[100000];
		int k = 1;
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		int[] it = new int[T];
		for (int i = 0; i < T; i++) {
			it[i] = in.nextInt();
		}

		int n = 100000;
		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { 
					flag = false;
					break;
				}

			}
			if (flag) {
				arr[k++] = i;
			}
		}
		int x = 0;
		while (T-- > 0) {
			int val = it[x++];
			System.out.println(arr[val]);
		}
	}

}