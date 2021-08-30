import java.util.*;
public class MultiplicationTable {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("Multiplication table for number "+num+" is:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
	}

}
