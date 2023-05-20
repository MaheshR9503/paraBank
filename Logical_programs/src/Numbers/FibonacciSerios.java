package Numbers;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FibonacciSerios {

	
	public static void main(String[] args) {
		
		
		
		
		int a=0, b=1, c, count=15;
		
		for(int i=0;i<count;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
			System.out.println(a+"&"+b);
			System.out.println("Series start= "+c);
		}
	}

}
