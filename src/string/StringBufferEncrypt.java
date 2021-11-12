package string;

import java.util.Scanner;

public class StringBufferEncrypt {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter string");

		String str = scr.next();
		StringBuffer sb = new StringBuffer(str);
		// royal
		// soyal

		int len = sb.length();
		for (int i = 0; i < len; i++) {
			System.out.println(sb.charAt(i) + 1);
			sb.replace(i, i + 1, sb.charAt(i) + 1 + "");
			System.out.println(sb);
		}
		System.out.println(sb);
//		sb.replace(0, 1, "s");
//		System.out.println(sb);
//
//		sb.replace(1, 2, "p");
//		System.out.println(sb);
//		
//		sb.replace(2, 3, "z");
//		System.out.println(sb);
//		
//		sb.replace(3, 4, "b");
//		System.out.println(sb);
//		
//		
//		sb.replace(4, 5, "m");
//		System.out.println(sb);
//		

	}

}
