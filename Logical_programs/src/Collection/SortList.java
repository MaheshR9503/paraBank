package Collection;

import java.util.*;

public class SortList {
	
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();
		
		al.add(25);
		al.add(68);
		al.add(94);
		al.add(365);
		al.add(254);
		al.add(981);
		
		System.out.println("List before sorting= "+al);
		Collections.sort(al);
		System.out.println("List after sorting= "+al);
		
		Collections.sort(al, Collections.reverseOrder());
		
		System.out.println("Reverse order= "+al);
	}
	
	

}
