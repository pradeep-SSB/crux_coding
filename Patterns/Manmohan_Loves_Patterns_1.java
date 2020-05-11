package Patterns;
import java.util.Scanner;

public class Manmohan_Loves_Patterns_1 {
	public static void main(String[] args) { 
		Scanner in =new Scanner(System.in);
		int n= in.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=i;j++) {
				
				if(j==1 || j==i|| (i%2 != 0)) {
					System.out.print("1");
				}
				
				else
				{
					System.out.print("0");
				}
				 
				
			}
			System.out.println();
		}
		
		
		
	}

}
