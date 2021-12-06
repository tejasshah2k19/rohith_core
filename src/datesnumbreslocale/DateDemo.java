package datesnumbreslocale;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString());

		System.out.println(d.getMonth());// Deprecated
		System.out.println(d.getYear());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime());
	}
}
