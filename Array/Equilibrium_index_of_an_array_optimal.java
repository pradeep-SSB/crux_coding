package Array;
import java.util.*;
public class Equilibrium_index_of_an_array_optimal { // Amazon (optimal soln)
public static void main(String[] args) {// T(n)= O(n)
	
		Scanner in = new Scanner(System.in);
		int N= in.nextInt();
		int[] arr =new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]= in.nextInt();
		}
		boolean flag=true;
		
		int sum=0;
		for(int i=0; i< N; i++) {
		sum+= arr[i];	
		}
		
		int l_sum=0;
		int r_sum=0;
		
		for(int i=0; i<N;i++) // must check the order run on paper
		{
			sum= sum - arr[i] ;// right array sum
			
			if(l_sum == sum) {
				System.out.println(i);
				flag= false;
			}
			
			l_sum = l_sum + arr[i];
			
			
					
					
		}
		if(flag== true)
		System.out.println("no Eqilibirium");
		
}
	
}
