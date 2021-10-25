import java.util.Scanner;

public class Covax {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("Welcome to Covax");
		user.getData();
		if (user.isEligible() == true) {
			System.out.println(user.firstName + " , your are eligible");
		} else {
			System.out.println(user.firstName + " , your are not eligible");
		}
	}
}

class User {
	String firstName;
	int birthYear;

	Scanner scr = new Scanner(System.in);

	void getData() {
		System.out.println("Enter firstname");
		firstName = scr.next();
		System.out.println("Enter birth Year");
		birthYear = scr.nextInt();
	}

	boolean isEligible() {
		if ((2021 - birthYear) >= 45) {
			//
			return true;
		} else {
			return false;
		}
	}
}
