package DateTesting;
import java.util.*;
import java.text.*;

public class SelfDateTesting {
	public static void main(String[] args){
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("This is the time and date 0: "+df.format(date));
		System.out.println("This is the date and time 1: "+ date);
		
		date.setTime(date.getTime()+ 36000000);
		System.out.println("This is the time and date 2: "+ date);
		
	}
}
