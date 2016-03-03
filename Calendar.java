/** U10416041 */

import java.util.GregorianCalendar;

/** Use the GregorianCalendar class */
public class Calendar extends GregorianCalendar {
	
	/** Constructors */
	public Calendar(int year, int month, int dayOfMonth) {
		super(year, month, dayOfMonth);
	}
	
	/** Get the English name for the month */
	public static String getMonthName(int month) {
		String monthName = "";
		
		switch (month) {
			case 0: monthName = "January";
			break;
			
			case 1: monthName = "February";
			break;
			
			case 2: monthName = "March";
			break;
			
			case 3: monthName = "April";
			break;
			
			case 4: monthName = "May";
			break;
			
			case 5: monthName = "June";
			break;
			
			case 6: monthName = "July";
			break;
			
			case 7: monthName = "August";
			break;
			
			case 8: monthName = "September";
			break;
			
			case 9: monthName = "October";
			break;
			
			case 10: monthName = "November";
			break;
			
			case 11: monthName = "December";
			break;
			
			default:
		}
		
		return monthName;
	}
	
	public String getMonthName() {
		return getMonthName(get(MONTH));
	}
	
	public static int getNumberOfDaysInMonth(int year, int month) {
		return new Calendar(year, month, 1).getNumberOfDaysInMonth();
	}
	
	/** Get the number of days in a month */
	public int getNumberOfDaysInMonth() {
		switch (get(MONTH)) {
			case 0:
			case 2:
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
			return 31;
			
			case 3:
			case 5:
			case 8:
			case 10:
			return 30;
			
			case 1:
			if (isaLeapYear(get(YEAR))) {
				return 29;
			}
			else {
				return 28;
			}
			
			default:
			return 0;
		}
	}
	
	/** Determine if it is a leap year */
	public static boolean isaLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}