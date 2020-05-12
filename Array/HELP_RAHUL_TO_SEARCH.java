package Array;
import java.util.*;
public class HELP_RAHUL_TO_SEARCH {
public static void main(String[] args) { 
	
	Scanner in = new Scanner(System.in);
	int N= in.nextInt();
	
	int[] arr = new int[N];
	
	for(int i=0;i<N; i++) {
		arr[i]=in.nextInt();}
	
	int element=in.nextInt();
	
	for(int i=0;i<N;i++) {
		if(arr[i]==element)
		{
			System.out.println(i);
			break;
		}
	}
	
	
	
}
}
