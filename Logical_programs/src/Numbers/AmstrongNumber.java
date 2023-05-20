package Numbers;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		
		int num, i=0;
		int a=0,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		num=a;
		
		while(num>0)
		{
			b=num%10;
			
			i=i+(b*b*b);
			
		}
		
		System.out.println(a);
	}

}
