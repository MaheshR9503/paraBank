package Array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		
		int[] array=new int[] {5,8,6,9,65,25,34,62};
		System.out.println(array.length);
	
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int temp=0;
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Largest number from array= "+array[7]);
		
		
	}
}
