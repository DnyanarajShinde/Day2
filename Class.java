import java.util.*;
public class Class {
	static int a,b,c;
	static double g,e,f;
	public static void add(int a, int b) {
		c=a+b;
		System.out.println("Addition is:"+c);
	}
	
	public static void add(double e, double f) {
		double g=e+f;
		System.out.println("Addition is:"+g);
	}
	
	public static void add(String str1, String str2) {
		String str3=str1+str2;
		System.out.println("Addition is:"+str3);
	}
	
	public static void main(String args[]) {
		//int a=10, b=20, c;
		/*Scanner sc= new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a=sc.nextInt();
		System.out.print("Enter second integer: ");
		int b=sc.nextInt();	*/
		
		add(2,3);
		add(4.0,5);
		add("dnyanaraj ","shinde");
		
		}
}
