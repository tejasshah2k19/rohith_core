package string;

public class StringMethods {

	public static void main(String[] args) {

		String s = "royal";
		System.out.println(s);
		// total numbers of characters in string
		// length of the string

		System.out.println(s.length());

		// r o => first two characters
		// r => first character
		// how we can access individual characters from string

		System.out.println(s.charAt(0));// 0th index //s[0] <= not works

		// how to find out index of given character?
		// i need to find index of a in royal ?
		System.out.println(s.indexOf('a'));

		// how we can search for word in a string?
		String s1 = "jony jony yes papa";
		// search papa is present in string
		System.out.println(s1.contains("papa")); // true
		System.out.println(s1.contains("mama")); // false

		String x = "jonny";
		String y = "jonny";
		String z = "Jonny";
		// how can i compare strings?
		// 1
		System.out.println(x.equals(y));// true
		System.out.println(x.equals(z));// false
		System.out.println(x.equalsIgnoreCase(z));// true

		// 2
		System.out.println(x.compareTo(y)); // 0
		System.out.println(x.compareTo(z)); // 32 jonny - Jonny [ 104-72 => 32 ]
		System.out.println(x.compareToIgnoreCase(z)); // 0

		String l = "royaleducation";
		String t = "traveleducation";
		String u = "food";

		//i need to check my string ends with on? 
		
		System.out.println(l.endsWith("on"));
		System.out.println(t.endsWith("on"));
		System.out.println(u.endsWith("on"));
		
		System.out.println(l.startsWith("on"));
		
		
		
		
	}

}
