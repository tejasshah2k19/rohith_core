package oop;

import java.util.Scanner;

public class RestaurantApp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Customer cust = new Customer();
		int choice;

		cust.signup();

		while (true) {
			System.out.println("Welcome To JyaBahvani Restaurtan");

			System.out.println("Press ");
			System.out.println("1 For DalDhokdi Rs 50");
			System.out.println("2 For Thepla Rs 40");
			System.out.println("3 For Dhokda Rs 30");
			System.out.println("4 For Exit ( PrintBill ) ");
			System.out.println("Enter Choice....");
			choice = scr.nextInt();

			switch (choice) {

			case 1:
				System.out.println("How many qty of DalDhokdi you want to buy?");
				cust.dalDhokdiQty = scr.nextInt();
				break;
			case 2:
				System.out.println("How many qty of Thepla you want to buy?");
				cust.theplaQty = scr.nextInt();
				break;
			case 3:
				System.out.println("How many qty of Dhokda you want to buy?");
				cust.dhokdaQty = scr.nextInt();
				break;
			case 4:
				System.out.println("************* BILL ****************");
				if (cust.dalDhokdiQty != 0) {
					cust.totalAmount = cust.totalAmount + (cust.dalDhokdiQty * 50);// 0 + (2*50) => 100
					System.out.println("DalDhokdi	" + cust.dalDhokdiQty + "	50	 " + (cust.dalDhokdiQty * 50));
				}
				if (cust.theplaQty != 0) {
					cust.totalAmount = cust.totalAmount + (cust.theplaQty * 40); // 100 + (5*40) => 300
					System.out.println("Thepla    " + cust.theplaQty + "   40   " + (cust.theplaQty * 40));
				}
				if (cust.dhokdaQty != 0) {
					cust.totalAmount = cust.totalAmount + (cust.dhokdaQty * 30); // 300 + (5*30) =>450
					System.out.println("Dhokda    " + cust.dhokdaQty + "   30   " + (cust.dhokdaQty * 30));
				}

				cust.tax = (int) (cust.totalAmount * 0.10);

				System.out.println("Total   =   " + cust.totalAmount);
				System.out.println("Tax [10%] =   " + cust.tax);
				System.out.println("Total Amount = " + (cust.totalAmount + cust.tax));
				System.exit(0);
			}// switch
		} // while

	}// main
}// class

//class 
class Customer {

	// instance variable
	String firstName;
	int mobileNumber;
	int dalDhokdiQty;
	int theplaQty;
	int dhokdaQty;

	int tax;
	int totalAmount;

	Scanner scr = new Scanner(System.in);

	// constructor
	public Customer() {
		dalDhokdiQty = 0;
		theplaQty = 0;
		dhokdaQty = 0;
		tax = 0;
		totalAmount = 0;
	}

	// method -- instance method
	void signup() {
		System.out.println("Enter Your FirstName and MobileNumber");
		firstName = scr.next();
		mobileNumber = scr.nextInt();
	}

}
