package array;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]; // declare
		a = new int[5];// 4 byte *5 => 20

		int b[] = new int[5];
		// a[0] a[1] a[2] a[3] a[4] -

//		a[0] = 1;
//		a[1] = 10;
//		a[2] = 100;
//		a[3] = 101;
//		a[4] = 110;
//		
//		System.out.println(a[0]);

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter number");
			a[i] = scr.nextInt(); // scna an integer and store into given index by i.
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
				
		}

	}

}








