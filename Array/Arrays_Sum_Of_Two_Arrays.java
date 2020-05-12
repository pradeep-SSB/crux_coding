package Array;
import java.util.*;
public class Arrays_Sum_Of_Two_Arrays {  // good question "syntsx"
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int N1=in.nextInt();
	
	int[] arr1 =new int[N1];
	for(int i=0; i< N1; i++) {
		arr1[i] = in.nextInt();}
	
	int N2= in.nextInt();
	int[] arr2= new int[N2];
	for(int i=0; i< N2; i++) {
		arr2[i] = in.nextInt();}
	
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	 

	int l1 ,l2; // if you declare them inside if else block there scope will be limited
	 int carry=0; // key
	 
	while(N1 >0 || N2 >0) {
		
		if(N1>0) 
	    l1 =arr1[N1-1];
		else l1=0;  // understood
		
		if(N2>0)
		 l2=arr2[N2-1];
		else 
			l2=0;
		
		 
		long sum = l1+l2+ carry; // logic
		carry=0; // when carry works done
				
		if(sum/10 != 0) {
		carry =  (int )sum/10;	//logic
			list.add((int )sum %10);
		}
		else  
			list.add((int) sum);
		
		 
		
	N1--;
	N2--; 
	}
	
	if(carry !=0) // when length exceeded N1 and N2
	list.add(carry);
	
	for(int i=list.size()-1; i>=0; i--) {
		System.out.print(list.get(i)+ ", ");
	}
	
//	for(Integer i : list)      
//		System.out.print(i + ", "); 
	
	System.out.print("END"); 
	

}
}