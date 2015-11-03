import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DaysBetween2Dates {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		String startDate,endDate;

		System.out.println("Enter start date:");
		startDate = input.nextLine();
		endDate = input.nextLine();

		DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Date start = format.parse(startDate);
		Date end = format.parse(endDate);
		
		long e = (end.getTime()-start.getTime())/1000/24;

		System.out.println();
	}

}
