package Array;
import java.util.*;

public class Arrays_target_Sum_Triplets { // first
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		int t_sum = in.nextInt();
		Arrays.sort(arr); // sort to match output order

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) { // j=i+1 so that element wont repeat
				for (int k = j + 1; k < N; k++) {// j=j+1 so that element wont repeat
					if ((arr[i] + arr[j] + arr[k]) == t_sum) {
						System.out.println(arr[i] + ", " + arr[j] + " " + "and" + " " + arr[k]);
					}
				}
			}
		}

	}
}
