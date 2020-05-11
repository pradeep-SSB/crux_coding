package Number_system_and_Data_type;
import java.util.*;
import  java.lang.Math.*;

public class Armstrong_number {  // check armstrong proper definition  on hackerblocks
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	long N= in.nextLong();
	long sum=0;
	long arm= N;
	long n= order(N); // finding order

	while(N>0) {
		long rem = N%10;
		sum= sum + (long )Math.pow(rem, n);
		
       N=N/10;
		
	}
	if(arm== sum) {
	System.out.println("true");
	}
	else
	System.out.println("false");
}
	public static long order(long n) {
		long sum=0;
		while(n!=0) {
		  n=n/10;
		 sum++;
		}
		return sum;
	}

}
