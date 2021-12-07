package datesnumbreslocale;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo {

	public static void main(String[] args) {

		Date d = new Date();
		// input -- string --> to ---> date
		System.out.println(d);

		DateFormat df1 = DateFormat.getDateInstance();
		String x = df1.format(d);
		System.out.println("default :  " + x);// 6 Dec, 2021

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
		x = df2.format(d);
		System.out.println("Short : " + x);

		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		x = df3.format(d);
		System.out.println("Medium : " + x);

		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
		x = df4.format(d);
		System.out.println("Long : " + x);

		DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL);
		x = df5.format(d);
		System.out.println("Full : " + x);

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter your dob");
		String dob = scr.next();// String => Date

		DateFormat dx = DateFormat.getDateInstance(DateFormat.SHORT);

		try {
			Date dateDob = dx.parse(dob);
			System.out.println("your date => " + dateDob);
		} catch (ParseException e) {
			System.out.println("your format of date in invalid (6/12/21)  (d/m/yy) ");
		}

	}
}
