package Array;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class Calender {
	
	public static String toCamelCase(String str) {
        String firstLetter = str.substring(0, 1);
        String rest = str.substring(1);
        return firstLetter.toUpperCase() + rest.toLowerCase();
    }

	public static void main(String[] args) {
		String d="14/05/2023";
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat form=new SimpleDateFormat("MMM dd, yyyy");  //May 06, 2023
		
		String date = form.format(cal.getTime());
		System.out.println(date);			//5/5/23 10:09 PM
//		String str1 = date.split(" ")[0].trim();
//		String str2 = date.split(" ")[1].trim();
		String month = date.replace("/05/2023", "");
		
		int parseInt = Integer.parseInt(month);
		
		Month of = Month.of(parseInt);
		String string = of.toString();
		
		
		System.out.println(toCamelCase(string));
		
		
		
		
		
	}
}
