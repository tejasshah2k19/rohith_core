package exceptiondemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			Scanner scr = new Scanner(System.in);
			int a = scr.nextInt();
			int b = scr.nextInt();

			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero in second number");
		} catch (InputMismatchException e) {
			System.out.println("Please enter only integer numbers");
		}
		catch (Exception e) {
			System.out.println("something went wrong please try after sometime");
			// sendMailToDeveloper(e)
		}

	}
}
//1 2 3 4 5 6 7  -> 8 -> 9 -> 10 -> 11 -> 21  