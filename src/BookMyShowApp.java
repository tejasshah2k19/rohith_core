import java.util.Scanner;

import sun.text.normalizer.CharTrie.FriendAgent;

public class BookMyShowApp {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		Customer cust = new Customer();

		while (true) {
			System.out.println(
					"1 For Signup and BookTicket\n2 For  Check Your Booking Status\n3 For Exit\nEnter your choice");
			int choice = scr.nextInt();// 1 2 3

			switch (choice) {
			case 1:
				cust.signup();
				cust.bookings();
				break;

			case 2:
				cust.printInfo();
				break;
			case 3:
				System.out.println("Thank you for using our service...");
				System.exit(0);

			}
		}
	}
}

class Customer {
	String firstName;
	int uniqueCode;

	int goldTicketCount = 0;
	int silverTicketCount = 0;
	int diamondTicketCount = 0;

	Scanner scr = new Scanner(System.in);

	void signup() {

		System.out.println("Enter your firstname");
		firstName = scr.next();// String - without space
		// scr.nextLine() -- with space

		uniqueCode = (int) (Math.random() * 1000000); // 0.2356215459455166 * 1000000 => 235621.5459455166
		// 234351
//		System.out.println(firstName);
//		System.out.println(uniqueCode);
	}

	void bookings() {
		System.out.println(
				"Press 1 for diamond : 500 RS \n2 For  silver : 250 RS  \n3 For Gold : 350\nEnter Your choice ");
		int choice = scr.nextInt();// 3
		System.out.println("How many Tickets?");
		int total = scr.nextInt();// 5

		if (choice == 1) {
			diamondTicketCount = total;
		} else if (choice == 2) {
			silverTicketCount = total;
		} else if (choice == 3) {
			goldTicketCount = total;
		}

	}

	void printInfo() {
		System.out.println(firstName + " 's  Booking Status ");
		System.out.println("Gold : " + goldTicketCount);
		System.out.println("Silver : " + silverTicketCount);
		System.out.println("Diamong : " + diamondTicketCount);
	}

}
