package String_Logical;

import java.util.Scanner;

public class ReverseSentense {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s = "Hello and welcome to automation testing";
		String s1="";
		
		String[] rev = s.split(" ");
		
		for(int i=rev.length-1;i>=0;i--)
		{
			s1=s1+rev[i]+" ";
		}
		
		System.out.println(s1);
	}

}
