package Array;
import java.util.*;

public interface lower_and_upper_bound {
	
			static Scanner in= new Scanner(System.in);
			
			public static void main(String[] args) {			
				int[] array = takeinput();
				
				  int query = in.nextInt();
			       int[] q = new int[query];
			
				  for(int i=0; i<q.length;i++){ // reading input using array
					q[i]= in.nextInt();
					}
				
				  
				  
				  int k=0;
				  while(query-->0) {   // use of array data
					int N = q[k++];
					
					int lb =lower_bound(array,N);
			         int ub= upper_bound(array,N);
			         System.out.println(lb + " " + ub);
				     }
				
		     }
			
			// Taking input
			public static int[] takeinput() {

				int n= in.nextInt();
				int[] arr= new int[n];
				
				for(int i=0; i< arr.length; i++) {
				 arr[i]= in.nextInt();
				}
				return arr;	
	}
			// Upper bound
			public static int upper_bound(int[] arr, int data ) {
				int L=0;
				int R= arr.length-1;
				
				int ans =-1;
				
				while(L<= R ) {
					int mid = ( L + R )/2;
					
					if(data== arr[mid]) {
						ans= mid;
						L =mid+1;
						
					}
					else if(data< arr[mid]) {
						R= mid-1;
					}
					else {
						L= mid +1;
					}
					
				}
				return ans;  
				
			}
	          // Lower bound
			public static int lower_bound(int[] arr, int data) {
				int L=0;
				int R= arr.length-1;
				int ans=-1;
				
				while(L <= R) {
				int mid =( L+ R)/2;
				
				if(data == arr[mid]) {
					ans = mid;
					R= mid-1;
					
					
				}
				else if(data< arr[mid]) {
					R= mid-1;
				}
				else {
					L= mid+1;
					
				}}
				return ans;
	}

}
