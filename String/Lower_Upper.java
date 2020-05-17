package String;
import java.util.*;

public class Lower_Upper {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	char ch= in.next().charAt(0);
//	lower_uper1(ch);
	lower_uper2(ch);
	
	
	
}
//		Inbuilt Java
public static void lower_uper1(char ch) {
	if(Character.isLowerCase(ch))
		System.out.println("lowercase");
		
	if(Character.isUpperCase(ch))
			System.out.println("UPPERCASE");
		
	else System.out.println("Invalid"); 
}


//  Global
public static void lower_uper2(char ch) {
	if(ch >= 97 && ch<= 122)
		System.out.println("lowercase");
		
		else if(ch>= 65 && ch<= 90)
			System.out.println("UPPERCASE");
		else System.out.println("Invalid"); 
}
}
