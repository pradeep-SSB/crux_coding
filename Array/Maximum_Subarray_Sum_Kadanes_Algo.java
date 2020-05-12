package Array;

import java.util.*;

public class Maximum_Subarray_Sum_Kadanes_Algo { // O(n)
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		int max_sum = Kadanes_algo(arr, N);
		System.out.println(max_sum);
	}
	

public static int Kadanes_algo(int[] arr, int n) { // Kadanes_algo
		int max_current_sum = arr[0];
		int max_global_sum = arr[0];
  
		for (int i = 1; i < n; i++) {
			max_current_sum = Math.max(arr[i], arr[i] + max_current_sum);

			if (max_current_sum > max_global_sum) {
				max_global_sum = max_current_sum;
			}
		}
		return max_global_sum;
	}
}
