package array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		int a[][] = new int[3][4];// 3-> row , 4->column ==> 3*4 => 12
		int i, j, sum = 0;
		Scanner scr = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Enter data");
				a[i][j] = scr.nextInt();
			}
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
				sum = sum + a[i][j];
			}
			System.out.println("");
		}

		System.out.println("Sum => " + sum);
	}// main
}// class
