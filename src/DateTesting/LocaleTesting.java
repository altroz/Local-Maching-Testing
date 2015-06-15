package DateTesting;
import java.util.*;
import java.text.*;


public class LocaleTesting {
	public static void main(String [] args){
		Calendar c = Calendar.getInstance();
		c.set(2011,01,18);
		Date d1 = c.getTime();
		
		Locale locIT = new Locale ("it", "IT");
		
		
		DateFormat dfUS = DateFormat.getInstance();
		System.out.println("US "+ dfUS.format(d1));
		
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy "+ dfIT.format(d1));
		
	}
}
