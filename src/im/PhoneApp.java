package im;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Scanner scr = new Scanner(System.in);
		ArrayList<Phone2> list = new ArrayList<Phone2>();// all 3 users
		while (true) {// placement

			System.out.println(
					"press 1 for Addcontacts \n 2 for list contacts \n 3 for search by city \n 4 for search by name \n 5 for search by letter \n 6 for search by number\n 7 for exit");
			choice = scr.nextInt();// scan
			switch (choice) {

			case 1:
				if (list.size() == 3) {
					System.out.println("Completed");
				} else {
					Phone2 p = new Phone2();
					p.getData();
					list.add(p);
				}
				break;//
			case 2:
				for (int i = 0; i < list.size(); i++) {
					list.get(i).printInfo();
				}
				break;//
			case 3:
				System.out.println("Enter city name to search :");
				String cityName = scr.next();// ahd

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).city.equals(cityName)) {
						list.get(i).printInfo();//
					}
				}

				break;//
			case 4:
				System.out.println("Enter Name");
				String name = scr.next();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).name.equals(name)) {
						list.get(i).printInfo();//
					}
				}

				break;//
			case 5:
				System.out.println("Enter your letter:");
				String letter = scr.next();// A

				for (int i = 0; i < list.size(); i++) {

					if (list.get(i).name.charAt(0) == letter.charAt(0)) {
						list.get(i).printInfo();//
					}
				}

				break;
			case 6:
					int num;
					System.out.println("Enter number?");
					num = scr.nextInt();
					for(int i=0;i<list.size();i++) {
						if(list.get(i).number == num) {
							list.get(i).printInfo();
						}
					}
				break;
			case 7:
				System.exit(0);

			}

		}
	}
}

class Phone2 {
	String name, city;
	int number;
	Scanner sc = new Scanner(System.in);

	void getData() {
		System.out.println("What's your name: \n city");
		name = sc.next();
		city = sc.next();
		System.out.println("Enter number");
		number = sc.nextInt();

	}

	void printInfo() {
		System.out.println(name + " " + city + " " + number + " ");
	}
}
