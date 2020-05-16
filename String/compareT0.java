package String;

import java.util.Scanner;

public class compareT0 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		String s1="pradeep";
		String s2 ="pradeepm";
		System.out.println(s1.compareTo(s2));
		
		

		String[] arr = new String[3];  
		
		for(int i=0; i< 3;i++) { 
			arr[i]= in.nextLine();
			}
		
//	----PRINTING------ 
//		for(int i=0;i<N;i++) {
//		System.out.println(arr[ i ]);
//		}
		
		for(String str: arr) {
			System.out.println(str);	
		}
	}
 
}
 