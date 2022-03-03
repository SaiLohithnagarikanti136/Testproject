package day10.ey;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class datecompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		System.out.println("CALENDER INSTANCE");
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(0));
		System.out.println(calendar.get(1));
		System.out.println(calendar.get(2));
		System.out.println(calendar.get(3));
		
		GregorianCalendar gc=new GregorianCalendar(2021, Calendar.MAY,20,18,9,22);
		GregorianCalendar gc1=new GregorianCalendar(2021, Calendar.APRIL,24,18,9,22);
		datecompare obj=new datecompare();
		
		obj.display(gc);
		obj.compareDate(gc, gc1);
	}
	public void display(GregorianCalendar gc) {
		System.out.println("GREGORIAN CALENDAR");
		System.out.println("YEAR: "+gc.get(Calendar.YEAR));
		System.out.println("MONTH: "+gc.get(Calendar.MONTH));
		System.out.println("DAY: "+gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("DATE "+gc.get(Calendar.DATE));
		
		
		Date date=gc.getTime();
		System.out.println(date);
	}
		
	public void compareDate(GregorianCalendar gc,GregorianCalendar gc1) {
		System.out.println("GREGORIAN CALENDAR DATE COMPARISION");
		if((gc.get(Calendar.MONTH))==(gc1.get(Calendar.MONTH))) {
			System.out.println("BOTH are of same MONTH");
		}
		else
			System.out.println("DIFFERENT MONTH");
	}

}

