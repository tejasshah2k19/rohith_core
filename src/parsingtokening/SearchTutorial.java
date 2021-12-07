package parsingtokening;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchTutorial {

	public static void main(String[] args) {

		// String str = "234m5n3iojkrnktio4039";

		// digit
		// group of digits
		// character
		// group of characters => string
		//
		search4();
	}

	static void search1() {

		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abaaab"); // string to search

		while (m.find()) { // true
			System.out.print(m.start() + " ");// 0 4
		}
		System.out.println("");

	}

	static void search2() {
		String str = "m34j5gtr8f7ds9";
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(str); // string to search

		System.out.println(str);
		while (m.find()) { // true
			System.out.print(m.start() + ":" + m.group() + ", ");// 0 4
		}
		System.out.println("");

	}

	static void search3() {
		String str = "m34j5gtr8f7ds9";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(str); // string to search

		System.out.println(str);
		while (m.find()) { // true
			System.out.print(m.start() + ":" + m.group() + ", ");// 0 4
		}
		System.out.println("");

	}

	static void search4() {
		String str = "m34j5gtr8f7ds9";
		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher(str); // string to search

		System.out.println(str);
		while (m.find()) { // true
			System.out.print(m.start() + ":" + m.group() + ", ");// 0 4
		}
		System.out.println("");

	}
}
