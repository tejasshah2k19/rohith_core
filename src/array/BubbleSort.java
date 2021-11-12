package array;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {

		int a[] = new int[8];

		Scanner scr = new Scanner(System.in);

		int i, j;

		// scanning
		for (i = 0; i < a.length; i++) {
			System.out.println("Enter number");
			a[i] = scr.nextInt();
		}

		System.out.println("Array Before Sorting");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// sorting
		int tmp;

		for (j = 0; j < a.length; j++) { // 0 1 2 3 4 5 6 7
			for (i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					tmp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tmp;
				}
			} // 3 5 6 7 8 9 11
		}
	}
}
