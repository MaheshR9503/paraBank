package String_Logical;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		
		String s="mahesh@Ragh$u";
		String s1="";
		
		s1 = s.replaceAll("[^a-zA-Z0-9]", ""); 
		
		System.out.println(s1);
		
		
	}
}
