package datesnumbreslocale;

import java.util.Calendar;

public class CalDemo {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();// getInstance()->will create object of Calendar ,
		// java has 1 child class of Calendar and getInstance() will return object of
		// that child class

		System.out.println(c);

		// java.util.GregorianCalendar[time=1638784728380,areFieldsSet=true,areAllFieldsSet=true,
		// lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",
		// offset=19800000,dstSavings=0,useDaylight=false,transitions=7,
		// lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
		// ERA=1,YEAR=2021,MONTH=11,WEEK_OF_YEAR=50,
		// WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=340,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,
		// HOUR=3,HOUR_OF_DAY=15,MINUTE=28,SECOND=48,MILLISECOND=380,ZONE_OFFSET=19800000,DST_OFFSET=0]

		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

		// 90 days

		c.add(Calendar.DATE, 90);
		System.out.println("after 90 days");
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

		// c.roll() //task //with demo
	}
}
