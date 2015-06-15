package com.FileNavigation;
import java.util.*;

public class TestCalendar {
	public static void main(String[] args){
		Date date = new Date();
		System.out.println("Old Information: "+ date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.roll (Calendar.MONTH, 3);
		Date date2 = c.getTime();
		System.out.println("New Information: "+ date2);
	}
}
