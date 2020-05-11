package Number_system_and_Data_type;// Brainstorming code .. try to write own condition and redo tuff
import java.util.*;
public class calculator_gd_code {
	public static void main(String[] args) {	
	char op;
	Scanner in =new Scanner(System.in);
	ArrayList<Integer> list =new ArrayList<Integer>();
	
	do {
		 op= in.next().charAt(0);	 
		
	    	if(op=='X' || op=='x') 
			break; 

		
		if( op=='+' || op=='-' || op=='*' || op=='/' || op=='%' )
		{  
	int N1=in.nextInt();
	int N2=in.nextInt();

	
	 
	if(op=='+') {
		list.add(N1 + N2);
	}  
	else if(op=='-') { 
	list.add(N1 - N2);  
	}
	else if(op=='*') { 
		list.add(N1 * N2); 
	}
	else if(op=='/') {
		list.add(N1 / N2);
	} 
	else if(op=='%') {
		list.add(N1 %N2);
	}
		} 
		
		
		
	else  
		{
				list.add(999999901);  // trick just hardcoded
//			System.out.println("Invalid operation. Try again.");
}
		
}    while(op!='X' || op!='x'); 
	
	for(int i=0; i< list.size();i++) {
		if(list.get(i)==999999901)   // checking trick
			System.out.println("Invalid operation. Try again.");
		else	
		System.out.println(list.get(i));
	}
}
}