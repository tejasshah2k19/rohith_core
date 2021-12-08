package parsingtokening;

import java.util.Scanner;

public class ScannerToken {

	public static void main(String[] args) {
		String str = "royal 1 eduaction 2 india 3 tejas";

		Scanner scr = new Scanner(str);
		while (scr.hasNext()) {

			if (scr.hasNextInt()) {
				System.out.println(scr.nextInt());
			} else {
//				System.out.println( scr.next()+" str ");
				scr.next();
			}
		}
	}
}
