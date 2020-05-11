package Patterns;

import java.util.Scanner;

public class Pt_1_Pattern_with_zeroes {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {

				if (j == 1 || (j == i))
					System.out.print(i + "\t");
				else
					System.out.print("0\t");
			}
			System.out.println();
		}

	}
}
