import java.util.*;
public class AreaAndPerimiterOfCircle {
	
	public static void main(String args[])
	{
		double area,perimeter;
		final double pi=3.14; 
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the radius of a circle: ");
		double r=sc.nextDouble();
		area=pi*(r*r);
		System.out.println("Area of circle is: "+area);
		perimeter=2*pi*r;
		System.out.println("Perimeter of circle is: "+perimeter);
	}
}
