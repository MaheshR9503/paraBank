package Numbers;

import java.util.Scanner;

public class FactorialNumbers {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int a=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorials of given numbers= "+fact);
	}

}
