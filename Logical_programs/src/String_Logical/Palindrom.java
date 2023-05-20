package String_Logical;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		
		String s=sc.next();
		
		String n="";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		
		n=new String(ch);
		
		  if(n.equalsIgnoreCase(s)) { System.out.println(s+" is a palindrom"); }else {
		  System.out.println("It is not palindrom"); }
		 
		
		
		System.out.println(n);
		
	}
}
