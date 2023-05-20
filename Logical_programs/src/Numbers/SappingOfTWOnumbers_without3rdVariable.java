package Numbers;

import java.util.Scanner;

public class SappingOfTWOnumbers_without3rdVariable {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	//without third variable
		
		System.out.println("Enter value of i and j");
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println(i+" & "+j);
		
		
//unsing third variable
		
		
		int x=10;
		int y=20;
		int z;
		z=x;
		x=y;
		y=z;
		
		
		System.out.println(x+" & "+y);
	}

}
