package Math;
import java.util.*;

public class Ramu_help { // Apptitude + contest
							// also check editorial solution for exlanaation

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int c1 = in.nextInt();
			int c2 = in.nextInt();
			int c3 = in.nextInt();
			int c4 = in.nextInt();

			int n = in.nextInt();
			int m = in.nextInt();

			int[] freq_R = new int[n];
			int[] freq_C = new int[m];

			for (int i = 0; i < n; i++) {
				freq_R[i] = in.nextInt();
			}

			for (int i = 0; i < m; i++) {
				freq_C[i] = in.nextInt();
			}
			vechile_cost(freq_R, freq_C, c1, c2, c3, c4);

		}
	}

	public static void vechile_cost(int[] freq_R, int[] freq_C, int c1, int c2, int c3, int c4) {
		int R_sum = 0;
		int C_sum = 0;

		for (int i = 0; i < freq_R.length; i++) {
			R_sum += Math.min(freq_R[i] * c1, c2);
		}

		int R = Math.min(R_sum, c3);

		for (int i = 0; i < freq_C.length; i++) {
			C_sum += Math.min(freq_C[i] * c1, c2);
		}
		int C = Math.min(C_sum, c3);

		min_cost(R, C, c4);

	}

	public static void min_cost(int R, int C, int c4) {
		System.out.println(Math.min((R + C), c4));

	}

}
