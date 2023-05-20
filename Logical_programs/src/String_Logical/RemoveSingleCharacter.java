package String_Logical;

public class RemoveSingleCharacter {

	
	public static void main(String[] args) {
		
		
		String s="Heleeelo";
		String s1="";
		
		
		
		char[] c = s.toCharArray();
		
		
		for(int i=0;i<c.length;i++)
		{
			if(!(c[i]=='e'))
			{
				s1=s1+c[i];
				
			}
			
			
		}
		
		System.out.println(s1);
	}
}
