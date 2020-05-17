package String;
import java.util.*;

public class Difference_in_Ascii_Codes {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	
	for(int i=0; i< str.length()-1 ;i++) {
		char ch1= str.charAt(i);
		char ch2= str.charAt(i+1);
	    int diff= (int) ch2 -ch1 ;
	    System.out.print(str.charAt(i) +""+  diff); 
	}
	System.out.println(str.charAt(str.length()-1));
}
} 
  