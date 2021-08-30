import java.util.Scanner;

public class SumOfDigitsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr a Number: ");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits: "+sum);  

	}

}
