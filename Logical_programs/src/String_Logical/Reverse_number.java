package String_Logical;

public class Reverse_number {
	
	public static void main(String[] args) {
		
		
		int i=222;
		
		int j=0, reminder;
		int z=i;
		
		while(i!=0)	
		{
			reminder=i%10;
			j=j*10+reminder;
			i/=10;
		}
		
		System.out.println(j);
		
		if(z==j)
		{
			System.out.println("Given number is palindrom");
		}
		else
		{
			System.out.println("It is not palindrom");
		}
	}

}
