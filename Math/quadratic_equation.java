package Math;
import java.util.*;
public class quadratic_equation {
public static void main(String[] args) {
	
	Scanner in= new Scanner(System.in);
	
	int a= in.nextInt();
	int b= in.nextInt();
	int c= in.nextInt();
	
	long x =  (long) ( -b + Math.sqrt(b*b - 4 *a *c) )/(2 * a );
	long x1 = (long) ( -b - Math.sqrt(b*b - 4 *a *c) )/(2 * a );

	double discriminant = (b*b - 4 *a * c ); // Note:  not Math.sqrt();

	if(discriminant < 0)
		System.out.println("Imaginary");
				
	
	else if(x1==x) {
		System.out.println("Real and Equal");
		display(x , x1);
		}
	
	else if(x1!=x) {
	System.out.println("Real and Distinct");
	display(x , x1);
	}
	

}
public static void display(long x,long x1) {
	if(x<x1)
		System.out.println(x+" "+ x1);

	else
		System.out.println(x1+" "+ x);
}
}
