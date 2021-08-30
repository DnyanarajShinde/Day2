public class Sub extends Class {
	static int a,b,c;
	static double g,e,f;
	public static void sub(int a, int b) {
		c=a-b;
		System.out.println("Substraction is:"+c);
	}
	
	public static void sub(double e, double f) {
		double g=e-f;
		System.out.println("Substraction is:"+g);
	}
	public static void main(String args[]) {
	/*int a=20, b=10, c;
	c=a-b;
	System.out.println("Substraction is: "+c);*/
		sub(5,4);
		sub(9.8,2.3);
	}
}
