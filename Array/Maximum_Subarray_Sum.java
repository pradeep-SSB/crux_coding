package Array;	// wrong do again----
import java.util.*;
public class Maximum_Subarray_Sum { // Brute force O(n*n)
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

//		int local_sum=Integer.MIN_VALUE;
//		int local_sum=0;  
		int loop_sum = Integer.MIN_VALUE;
		int final_sum = Integer.MIN_VALUE;
		

		for (int i = 0; i < N; i++) {
			int local_sum = 0;		//key
			for (int j = i; j < N; j++) { // **** Key j=i for edge condition (i=1) testing
				local_sum += arr[j];
				if (local_sum > loop_sum) {
					loop_sum = local_sum;
				}

			}
			if (loop_sum > final_sum) {
				final_sum = loop_sum;
			}
		}
		System.out.println(final_sum); 

	}

}
