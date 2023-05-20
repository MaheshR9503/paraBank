package Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InstancofTask {


	public static void main(String[] args) {
	
		
		List<Object>o=new ArrayList<>();
		
		o.add(11);
		o.add("AA");
		o.add(33);
		o.add("axxx");
		
		Iterator<Object>itr = o.iterator();
		
		while(itr.hasNext())
		{
			Object list = itr.next();
			
			if(list instanceof Integer)
			{
				int list2 = (int) list;
				System.out.println(list2);
			}
			if(list instanceof String)
			{
				String list2 = (String) list;
				System.out.println(list2);
			}
		}
	}

}
