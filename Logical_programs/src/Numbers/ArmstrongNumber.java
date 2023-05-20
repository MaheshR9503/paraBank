package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a,b,c=0;
		double x, sum=0;
		System.out.println("Enter a number");
		a=sc.nextInt();
		b=a;
		for(int i=a;i>0;)
		{
			i/=10;
			c++;
		}
		
		while(a>0)
		{
			
			x=a%10;
			x=Math.pow(x, c);
			sum=sum+x;
			a/=10;
			
		}
		
		if (b==sum) {
			
			System.out.println("It is an armstrong number");
			
		} else {
			System.out.println("It is not an armstrong nmber");

		}
	}

}
