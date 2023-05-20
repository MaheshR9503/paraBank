package String_Logical;

import java.util.Scanner;

public class Palindrom_1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr a string");
		String s=sc.next();
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
			s1=s1+s.charAt(i);
		System.out.println(s1);
		
		
		if(s1.equalsIgnoreCase(s))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrom");
	}
}
