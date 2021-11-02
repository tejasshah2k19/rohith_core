package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {

		int i,j;
		int a[][] = new int[3][];
		a[0] = new int[3];
		a[1] = new int[5];
		a[2] = new int[2];
		
		Scanner scr = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.println("Enter number");
				a[i][j] = scr.nextInt();
			}
		}
		
		
		
		System.out.println("Elements in a JaggedArray");
		for(i=0;i<3;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
