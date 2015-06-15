package com.FileNavigation;
import java.util.*;
import java.text.*;

public class TestParseDateFormat {
	public static void main(String [] args){
		Date date = new Date();
		System.out.println("Old Information: "+ date);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s = df.format(date);
		System.out.println(s);
		
		try{
			Date d2 = df.parse(s);
			System.out.println("Parse = "+ d2.toString());
		}
		catch (ParseException pe){
			System.out.println("parse exc");
		}
	}
}
