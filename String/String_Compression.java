package String;
import java.util.*;
public class String_Compression {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 
	String str = in.nextLine();

	String_Compression(str);
	
}
	public static  void String_Compression(String str)
	{
		int count =1;
		String out="";
		
		for(int i=0; i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
			count++;	
			}
			
			else 
			{
//				out += str.charAt(i) + count;    here it treat right side as integer(char) as number 
				
					out = out + str.charAt(i);   //Key-->  Do this 
					
					if(count !=1 )
					out = out + count; 
						
				count =1;				
			}
		}
		out = out + str.charAt(str.length()-1);
		
		if(count != 1 )
			out = out + count; 
		
		System.out.println(out); 
		
		
	}
	
}
