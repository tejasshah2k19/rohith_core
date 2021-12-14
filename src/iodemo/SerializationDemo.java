package iodemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializationDemo {

	public static void main(String[] args) {
		int choice = -1;
		Scanner scr = new Scanner(System.in);
		Bank b[] = new Bank[10];// 10 b[0] b[1] b[2] b[3] b[4] ...b[9]
		int totalOpenAccountCounter = -1;
		final int MAX_ACCOUNT = 10;

		while (true) {
			System.out.println("1 for open account\n2 for view account\n3 for exit");
			System.out.println("enter choice");
			choice = scr.nextInt();// 2
			switch (choice) {
			case 1:
				totalOpenAccountCounter++;// 0
				if (totalOpenAccountCounter == MAX_ACCOUNT) {
					System.out.println("accounts full");
				} else {
					b[totalOpenAccountCounter] = new Bank(); // b[0]
					b[totalOpenAccountCounter].openAccount();// b[0]
				}
				break;
			case 2:
				System.out.println("***********customers****************");

				for (int i = 0; i <= totalOpenAccountCounter; i++) {
					b[i].printData();
				}

				break;
			case 3:
				// Serialization
				File f = new File("d:\\abc\\bank.txt");
				try {
					f.createNewFile();
					FileOutputStream fos = new FileOutputStream(f);
					ObjectOutputStream oos = new ObjectOutputStream(fos);

					for (int i = 0; i <= totalOpenAccountCounter; i++) {
						oos.writeObject(b[i]);// b[0] ==>
					}

					oos.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		}
	}
}

//empty interface -- marker interface 
class Bank implements Serializable {
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

		this.balance = (int) (Math.random() * 100000);
	}

	void printData() {
		System.out.println(firstName + " " + email + " " + pan + " " + balance);
	}

	//

	//

	//

	//

}
