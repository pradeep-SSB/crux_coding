package String;

import java.util.*;
public class Reverse_string {  // can also be done using stack
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str= in.nextLine();
		System.out.println( reverse_string(str) );
	}
	
public static String reverse_string(String str) {
	int R= str.length()-1;
	int L=0;
	
	char[] str1 = str.toCharArray();
	
	
	 
	 while(L < R) {
		 char ch = str1[R];
		 str1[R] = str1[L]; 
		 str1[L]= ch;
		 L++;
		 R--; 
		 
	 }
//	 for(char ch : str1)
//System.out.print(ch);	
	return String.copyValueOf(str1); //--String.copyValueOf()- covert chararray to string
}
}
