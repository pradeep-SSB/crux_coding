package Number_system_and_Data_type;  // approach 1 hardcoded too much complexity
import java.util.*;
public class prateek_candy {
	public static void main(String[] args) {

		int[] arr =new int[100000];
		int k=1;
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		
		int[] it = new int[T];
		for(int i=0; i<T;i++)
		{
			it[i]= in.nextInt();
		}
		
		
		
	    int n=100000; 
	    for(int i=2; i<= n;i++){
	        boolean flag =true;
	        for(int j=2; j< i ;j++){
	            if(i%j==0){
	                flag =false;
	                  break; 
	            }
	           
	        }
	        if(flag){
	        	arr[k++]=i;
//	            System.out.println(i);
	            }
	    }
	    int x=0;
	    while(T-->0) {
	    	int val =it[x++];
	    	 System.out.println(arr[val]); 
//	    System.out.println(arr[0]+" " + arr[1]+" " + arr[2]);
	    
	    }
	}

	}