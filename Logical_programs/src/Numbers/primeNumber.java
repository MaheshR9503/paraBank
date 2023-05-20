
package Numbers;

import java.util.Scanner;

public class primeNumber {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		int i;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println("Given number is not prime number");
				break;
			}
		}
		if(a==i) {
		System.out.println("Given number is prime number");
		}
	}
}
