package String;

import java.util.Scanner;

public class Reversing_words_in_String {
	public static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
	String str= in.nextLine();
//	System.out.println(reverse_words1(str) );	
	System.out.println(reverse_words2(str) );	 
	
}

public static StringBuilder reverse_words2( String str) { // using String builder
		int L= str.length();
		StringBuilder temp_str = new StringBuilder();
		StringBuilder final_str =new StringBuilder();
		
		char space = ' ';  
		for(int i=0; i< str.length();i++) {
			if(str.charAt(i) != space ) {
						temp_str.append(str.charAt(i));
					}
			else
			{
				final_str.insert(0, temp_str).insert(0, ' '); // like add + replace
				temp_str.setLength(0);    // making stringbuilder temp_str empty
				 
			}
		}
			final_str.insert(0, temp_str);
   	return final_str;
	
	
}

public static String reverse_words1(String str) { // using string
	int L= str.length();
	String temp_str = ""; 
	String final_str="";
	
	char space = ' ';
	char[] ch = str.toCharArray();
 	for(int i=0; i < L ; i++ ) {
 		if(ch[i] != space ) {
 			temp_str = temp_str +  ch[i] ; // typecasting awesome.. -- String + char
 		}
 		else {
 			final_str = space + temp_str +  final_str; // char + String + String 
 			temp_str = "";
 		} 
 	}
 	final_str = temp_str + final_str;
	return final_str;
}

}
