import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class DatesOperations {
	
	public static int getDaysBetweenDates(Date startDate, Date endDate){
		return Days.daysBetween(new DateTime(startDate), new DateTime(endDate)).getDays();
	}

}
