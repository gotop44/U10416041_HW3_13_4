/** U10416041 */

/** Import GregorianCalendar */
import java.util.GregorianCalendar;

public class DisplayCalendars {
	
	private static Calendar calendar;
	
	/** Main method */
	public static void main(String[] args) {
		
		if (args.length > 2) {
            		System.out.println("Invalid");
            		System.out.println("Ex: java DisplayCalendars 3 2016");
            		System.exit(1);
        	}
		
		int year;
		int month;
		
		if (args.length == 1) {
			year = Calendar.getInstance().get(Calendar.YEAR);
			month = Integer.parseInt(args[0]) - 1;
		}
		else if (args.length == 0) {
			year = Calendar.getInstance().get(Calendar.YEAR);
			month = Calendar.getInstance().get(Calendar.MONTH);
		}
		else {
			year = Integer.parseInt(args[1]);
			month = Integer.parseInt(args[0]) - 1;
		}
		
		calendar = new Calendar(year, month, 1);
		calendar.set(Calendar.DATE, 1);
		
		printMonth();
	}
	
	/** Print the calendar for a month in a year */
	public static void printMonth() {
		/** Print the headings of the calendar */
		printMonthTitle();
		/** Print the body of the calendar */
		printMonthBody();
	}
	
	/** Print the month title */
	public static void printMonthTitle() {
		System.out.println("         " + calendar.getMonthName() + " " + calendar.get(Calendar.YEAR));
        	System.out.println("-----------------------------");
        	System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	/** Print month body */
	public static void printMonthBody() {
		/** Get start day of the week for the first date in the month */
		int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		/** Get number of days in the month */
		int numberOfDaysInMonth = calendar.getNumberOfDaysInMonth();
		int i = 0;
		
		/** Pad space before the first day of the month */
        	for (i = 0; i < startDay; i++) {
            		System.out.print("    ");
		}

        	for (i = 1; i <= numberOfDaysInMonth; i++) {
            		System.out.printf("%4d", i);

            		if ((i + startDay) % 7 == 0) {
                		System.out.println();
            		}
        	}

        	System.out.println();
	}
}
