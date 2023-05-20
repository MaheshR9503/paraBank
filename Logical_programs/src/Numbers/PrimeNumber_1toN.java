package Numbers;

public class PrimeNumber_1toN {
	
	public static void main(String[] args) {
		
		
		System.out.println("Prime number");
		
		int i,j;
		
		for( i=1;i<25;i++)	
		{
			boolean isPrime=true;
			for( j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime= false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(i);
			}
		}
		
	}

}
