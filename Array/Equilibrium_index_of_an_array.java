package Array;
import java.util.*;// GFG

public class Equilibrium_index_of_an_array { // T(n)= O(n*n)  and S(c)=O(1)

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N= in.nextInt();
		int[] arr =new int[N];
		for(int i=0; i<N; i++) {
			arr[i]= in.nextInt();
		}
		boolean flag=true;
		
		
		
		if(N==1) // element itself equilibirium 
			System.out.println("1"); 
		
		for(int i=0; i<N;i++) {
			
			int l_sum=0;
			int r_sum=0;
			
			
			for(int j=0; j<i;j++) {
				l_sum+=arr[j];
			}
			 
			for(int j= i+1; j< N ;j++) {
				r_sum+= arr[j]; 
				
			}
			
			if(l_sum == r_sum) {	// might be multiple equlibrim point eg- {-7 1 5 2 -4 3 0}
				System.out.println(i );
				flag= false;
				
			}
			 
			 
			
		}
		if(flag==true)
		System.out.println("No Equilibirium");
		
		
	}
	
}
