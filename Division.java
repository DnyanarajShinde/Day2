public class Division extends Multiplication{
	static int a,b,c;
	static double g,e,f;
	public static void div(int a, int b) {
		c=a/b;
		System.out.println("Division is:"+c);
	}
	
	public static void div(double e, double f) {
		double g=e/f;
		System.out.println("Division is:"+g);
	}
	public static void main(String args[]) {
	/*int a=20, b=10;
	float c;
	c=a/b;
	System.out.println("Division is: "+c);*/
		add(2,3);
		add(4.0,5);
		add("dnyanaraj ","shinde");
		sub(5,4);
		sub(9.8,2.3);
		mul(4,2);
		mul(2.2,4.3);
		div(7,8);
		div(7.0,8);
	}
}
