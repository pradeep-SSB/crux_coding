package fundamentals;
import java.util.*;

public class increasing_decreasing { // Logical think algo
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;

		int N = in.nextInt();
		int inc = 0;
		int p = in.nextInt(); // the first element
								// p tracks record of previous element
								// e is the current element
		N--; // bcz : previous already taken

		while (N-- > 0) {
			int e = in.nextInt();

			if (p == e) {// As for strictly increasing function, equal values at adjacent position is not
							// accepted
				flag = false;
				System.out.println("false");

				break;
			}

			else if (p > e && inc == 1) {// in case, there is a decrease after an increase in the sequence
				flag = false;
				System.out.println("false");
				break;
			}

			else if (p < e) { // once the sequence start increasing mark it by setting inc as 1.
				inc = 1;
			}

			p = e;// make current account as previous

		}
		if (flag == true) // if no false, print true
			System.out.println("true");
	}

}
