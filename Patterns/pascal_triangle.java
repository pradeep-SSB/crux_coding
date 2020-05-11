package Patterns;
import java.util.*;
public class pascal_triangle {   // old maths check pascal triangle property
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	int N =in.nextInt();
	
	for(int i=1; i<=N;i++) {
		for(int j=1; j<=i; j++) {
			
			System.out.print(cal(i , j)+"\t");
		}
		System.out.println();
	}
	
}
public static int cal(int n, int r) { // permutation:  nCr 
		n--; // bcoz in pascal triangle property it's starts with 0 index of 'n' and 0 index of 'r'
		r--;
		int c = factorial(n )/( (factorial(n -r)) * factorial(r) );
		
		return c;
}
	  
	public static int factorial(int x) {  // calculatiog factorial
		
		if(x==1 || x==0) { 
			return 1;
		}
		
		else  
		return x * factorial(x-1);
		}
}
