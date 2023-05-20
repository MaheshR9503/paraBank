package Numbers;

import java.util.Scanner;

public class Print_REVERSE_ofNto1numbers {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int i=sc.nextInt();
		
		for(int n=i;i>=1;i--)
			System.out.println(i);
	}

}
