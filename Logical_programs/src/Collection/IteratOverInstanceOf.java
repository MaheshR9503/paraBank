package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratOverInstanceOf {

	public static void main(String[] args) {
		
		List<Object> al=new ArrayList<>();
		
		al.add("Mahesh");
		al.add("Ram");
		al.add(225);
		al.add(365);
		System.out.println(al);
		
		ListIterator<Object> itr = al.listIterator();
		
//		Iterator<Object> itr = al.iterator();
//		
//		while(itr.hasNext())
//		{
//			Object o=itr.next();
//			
//			if(o instanceof Integer)
//			{
//				int a=(int)itr.next();
//				System.out.println(a);
//			}
//			
//			if(o instanceof String)
//			{
//				String a=(String)itr.next();
//				System.out.println(a);
//			}
//			
//		}
		
		
		while(itr.hasNext())
		{
			
			Object previous = itr.next();
			System.out.println(previous);
		}
	}
}
