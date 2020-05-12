package Array;
import java.util.Scanner;

public class searching_linear_time {
	static Scanner in= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Element to search: ");
		int n =in.nextInt();
		int[] array = takeinput();
		linear_search(array, n);
//		display(array );
	}

//	Taking Input
public static int[] takeinput() {
	
	System.out.print("Array SIZE: ");
	int n= in.nextInt();
	int[] arr =new int[n];
	
	System.out.print("Elements: ");
	
	for(int i=0; i< arr.length; i++) {
		arr[i] =in.nextInt();
	}
	
	return arr;
}
// Display data
public static void display(int [] a) {
	for(int val: a) {
		System.out.println(val);
	}
}


// Linear Search
public static void linear_search( int[] srr, int el) {
	boolean flag=false;
	for(int i=0; i< srr.length; i++) {
	if(srr[i]== el) {
		System.out.println("Element found at index: " + i + " & Position: "+ (int)(i+1)); // if you type cast it treats "i+1' as string 
		flag = true;
	}
	}
	if (flag == false)
	System.out.println("Not found");
}	
}
