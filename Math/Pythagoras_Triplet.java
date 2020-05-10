package Math;
// Java program to find //
// Pythagoras triplet 
// with one side as 
// given number. 
import java.io.*;
import java.util.Scanner;

class Pythagoras_Triplet // two test cases not passing
{

// Function, to evaluate 
// the Pythagoras triplet 
// with includes 'n' if 
// possible 
	static void evaluate(int n) {
		if (n == 1 || n == 2)
			System.out.println("-1");

		else if (n % 2 == 0) {				// Calculating for even case
			int var = 1 * n * n / 4;
			System.out.print((var - 1) + " " + (var + 1));

		} else if (n % 2 != 0) {	//Calculating for odd case

			int var = 1 * n * n + 1;

			System.out.print((var / 2 - 1) + " " + (var / 2));

		}
	}

// Driver Code 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		evaluate(n);
	}
}

// This code is contributed 
// by ajit 
