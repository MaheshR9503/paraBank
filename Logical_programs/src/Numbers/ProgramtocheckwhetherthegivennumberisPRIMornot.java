package Numbers;

import java.util.Scanner;

public class ProgramtocheckwhetherthegivennumberisPRIMornot {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number= ");
		int i=sc.nextInt();
		int n;
		
		
		
		if(i==1)
		{
			System.out.println("prime number start from 2");
		}
		
		for(n=2;n<i;n++)
		{
			if(i%n==0)
				System.out.println("It is not prime number");
			
			break;
		
		}
	
		if(n==i)
		{
			System.out.println("it is a prime number");
		}
		
	}

}
