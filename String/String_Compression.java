package String;
import java.util.*;
public class String_Compression {
	public static void main(String[] args) {m
	Scanner in = new Scanner(System.in); 
	String str = in.nextLine();

	String_Compression(str);
	
}
	public static  void String_Compression(String str)
	{
		
		for(int i=0;i<str.length()-1;i++) {
			int count=1;
			if(str.charAt(i)== str.charAt(i+1)) {
				count++;
			}
			
			if(str.charAt(i) != str.charAt(i+1))
			for(int j=i;j<str.length();j++) {
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		int max_count=1; 
		int i=0; 
		for( i=0; i< str.length()-1;i++) {
		int	 count=1;
			 max_count=1;
			for(int j=i+1;j< str.length();j++){
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					if(count>max_count) {
						max_count =count;
						}
				}
			} 
			
			
			if(str.charAt(i)!= str.charAt(i+1)) 
			System.out.print(str.charAt(i) + "" + max_count);
		}
	
			System.out.print(str.charAt(i) + "" + max_count);
		 
	} 
}
