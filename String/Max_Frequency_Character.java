package String;
import java.util.*;
public class Max_Frequency_Character {  // Burte force Go for Hashing ..
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str= in.nextLine();
		
		if(   str== null || str.length()==0 )
			System.out.println("Null String");
		else
			System.out.println(max_occurence(str));
		
		
	}
	
public static char max_occurence(String str) {
	
	if(str.length()==1) { 
		return str.charAt(0);	
		}  
		
	        int max_count=0;
	        char ch=str.charAt(0);
	       
			for(int i=0; i<str.length()-1 ;i++)
			{
				int count =1;
				char l_ch=str.charAt(i);
				for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
				}
				}
				if(count> max_count) {
					max_count = count;
					ch=l_ch;
					
				}
				}
//			System.out.println(max_count);
		return ch;
			
			
	}

}
