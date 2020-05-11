package Patterns;
import java.util.*;

public class fibonacci_Pattern {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

	int count=0;
//		fibonaci( N);
		
		for(int i=1; i<=N;i++ ) {
			for(int j=1; j<=i;j++) {
				count++;
				
				System.out.print(fibonaci(count)+ "\t");
				
			} 
			System.out.println();
		}
 
	}

	public static int  fibonaci(int n) {
		int a = 0;
		int b = 1;
		
		int x=0;

		while (n-- > 0) {
			int c = a + b;
           //			System.out.println(a); // prints fibonaci series
		
x=a; // bcoz a prints next number of series so here store it and print outside.
			a = b;
			b = c;

		}
//		System.out.println(x);
		return x;

	}
}
