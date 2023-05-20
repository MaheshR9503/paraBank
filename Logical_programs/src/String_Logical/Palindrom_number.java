package String_Logical;

import java.util.Scanner;

public class Palindrom_number {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int x=0,remainder;
		
		int b=a;
		
		while(a!=0)
		{
			remainder=a%10;
			x=x*10+remainder;
			a/=10;
		}
		
		System.out.println(x);
		
		
		if(x==b)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("It is not palindromde");
		}
	
	}

}
