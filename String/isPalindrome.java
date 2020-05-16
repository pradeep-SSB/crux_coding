package String;
import java.util.*;

public class isPalindrome { // O(N)  two pointer **
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println( isPalindrome(str) );
	}
	public static boolean isPalindrome(String str) {
		int L=0;
		int R= str.length()-1;
		boolean flag=false;
		
		while(L < R) {
			if(str.charAt(L)== str.charAt(R)) {
				L++;
				R--;
				
			}
			else
				return flag; 
		}
		flag=true;
		
		return flag;
		
	}

}
