package iodemo;

import java.util.Scanner;

public class SerializationDemo {

	public static void main(String[] args) {
		int choice = -1;
		Scanner scr = new Scanner(System.in);
		Bank b = new Bank();

		while (true) {
			System.out.println("1 for open account\n2 for view account\n3 for exit");
			System.out.println("enter choice");
			choice = scr.nextInt();// 2
			switch (choice) {
			case 1:
				b.openAccount();// f e p => t
				break;
			case 2:
				System.out.println("***********customers****************");
				System.out.println(b.firstName);
				System.out.println(b.balance);
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}

class Bank {
	float balance;
	String firstName;
	String pan, email, password;

	void openAccount() {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter email and password");
		this.email = scr.next();
		password = scr.next();

		System.out.println("enter firstnme and pan");
		this.firstName = scr.next();
		this.pan = scr.next();

		this.balance = (int) Math.random() * 100000;
	}
}
