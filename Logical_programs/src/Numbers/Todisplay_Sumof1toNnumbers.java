package Numbers;

import java.util.Scanner;

public class Todisplay_Sumof1toNnumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number= ");
		
		int i=sc.nextInt();
		int sum=0;
		
		
		for(int n=1;n<=i;i--)
		{
			sum=sum+i;
			System.out.println(sum);
		}
	}
}
