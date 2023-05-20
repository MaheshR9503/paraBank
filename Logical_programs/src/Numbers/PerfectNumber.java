package Numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num,temp,fact=1,a,div;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		
		
		for(int i=1;i<num;i++)
		{
			a=num%i;
			sum=sum+fact*a;
			num/=10;
		}
		
		
		if(num==sum)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
	}
}
