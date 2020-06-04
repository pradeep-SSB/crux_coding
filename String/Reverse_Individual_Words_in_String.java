package String;
import java.util.*;   									//Input : Hello World						
public class Reverse_Individual_Words_in_String {		//Output : olleH dlroW
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
//		System.out.println(reverse(str));
		System.out.println(reverse2(str));
		
}
	public static StringBuilder reverse2(String str) {  // StringBuilder faster
		StringBuilder str1 = new StringBuilder(str);
		StringBuilder temp_string = new StringBuilder();
		StringBuilder final_string = new StringBuilder("");
		
		char space = ' ';
		for(int i=0; i< str1.length() ; i++) {
			if( str1.charAt(i) != space) { 
			 temp_string.insert(0, str1.charAt(i))  ;
						}
			else
			{
				final_string.append(temp_string).append(" ") ;
				temp_string.setLength(0);
			}
		}
		final_string.append(temp_string);
		return final_string;
	}

	
	
	
	public static String reverse(String str) {
		String temp_string="";
		String final_string= "";
		char space =  ' ';
		
		for(int i=0; i< str.length() ; i++) {
			if(str.charAt(i) != space) {
				temp_string = str.charAt(i) + temp_string;
			}
			else
			{
				final_string = final_string + temp_string + " ";  
				temp_string = "";
			}
				} 
		
		final_string = final_string + temp_string;
 
		return final_string;
	}

}
