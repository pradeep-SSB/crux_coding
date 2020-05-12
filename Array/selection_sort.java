/*package whatever //do not write package name here */
package Array;

import java.util.*;

class selection_sort {
	static Scanner in= new Scanner(System.in);
public static void main(String args[]) {
		int[] array = takeinput();
		
           selection_sort(array);
     }
	
	public static int[] takeinput() {
		int n= in.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i< arr.length; i++) {
		 arr[i]= in.nextInt();
		}
		return arr;	
	}
	public static void display(int[] arr) {
		for(int val: arr)
			System.out.print(val+ " ");
		
	} 
	
	public static void selection_sort(int[] arr) {
		int j=0;
		
		for(int i=0; i<arr.length-1;i++){
			int min =i;
			for(j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j])
				min= j;
			}
			int temp= arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
					
		display(arr);	
}
    
}