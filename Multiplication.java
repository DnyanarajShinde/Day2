public class Multiplication extends Sub{
	static int a,b,c;
	static double g,e,f;
	public static void mul(int a, int b) {
		c=a*b;
		System.out.println("Multiplication is:"+c);
	}
	
	public static void mul(double e, double f) {
		double g=e*f;
		System.out.println("Multiplication is:"+g);
	}
	public static void main(String args[]) {
	/*int a=20, b=10, c;
	c=a*b;
	System.out.println("Multiplication is: "+c);*/
		mul(4,2);
		mul(2.2,4.3);
	}
}
