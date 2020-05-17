package String;
import java.util.*;
public class CanYouReadThis { 								// IAmACompetitiveProgrammer
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
//		sol_1_CanYouReadThis(str);
		sol_2_CanYouReadThis(str);


}
	public static void sol_2_CanYouReadThis(String str) {  // print in new line when Upper case
		boolean flag=false;
			for(int i=0; i<str.length(); i++ ) {
			
			if(Character.isUpperCase(str.charAt(i)) && i!=0   ) {
				System.out.println();

			}
			System.out.print(str.charAt(i));	
	}
		 
}
	
	
	
	
	
public static void sol_1_CanYouReadThis(String str) { // making string array and storing words in it.
		String[] str_array= new String[1000];

		
	int k=0;
	int i=0;
	for( i=0;i<str.length()-1;i++) {
		if(Character.isUpperCase(str.charAt(i))) {
			
		  for(int j=i+1;j<str.length();j++) {
			  if(Character.isUpperCase(str.charAt(j) ) ) {
				  str_array[k++]= str.substring(i, j);
				  break; 
	   	    	}
			  
			  // Case - When j reaches end
			  if(j==str.length()-1) {
				  str_array[k++]=str.substring(i, str.length());
			  } 
		   
		       
		  }
	  } 
	}
	
	
	// Case - when last character is Camel letter
if(Character.isUpperCase(str.charAt(str.length()-1))) {
		str_array[k]= str.substring(str.length()-1,str.length());
}
	
	
	
	 
	
	for(String chk : str_array ) {
		if(chk != null)
		System.out.println(chk);
	}
	}
}
