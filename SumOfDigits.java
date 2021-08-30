import java.util.Scanner;
public class SumOfDigits {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter a second number: ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of digits is: "+sum);
	}
}
