package datesnumbreslocale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {

		Date d = new Date();
		Locale loc = new Locale("ja");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
		System.out.println(df.format(d));

		loc = new Locale("hi", "in");
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.FULL, loc);
		System.out.println(dfs.format(d));

	}
}
