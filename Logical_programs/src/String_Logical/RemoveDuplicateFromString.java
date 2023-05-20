package String_Logical;

import java.util.*;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String s="MaheshMaheshMahesh";
		String s1="";
		char[] charArray = s.toCharArray();
		Set<Character> set=new LinkedHashSet<>();
		for (char c : charArray) {
			
			 set.add(c);
			 
		}
		Iterator<Character> it = set.iterator();
		
		while(it.hasNext())
		{
			s1=s1+it.next();
		}
		System.out.println(s1);
	}

}
