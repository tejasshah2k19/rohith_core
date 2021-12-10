import java.util.Scanner;

public class PhoneWaleApp {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("=============== ADMIN ================");
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();

		p1.getData();// iphone apple 50000 5000
		p2.getData();// gt me realme 25000 3000
		p3.getData();// a22 samsung 18000 2300

		// array of objects
		// sorting --> on base of price of phone

		Phone p[] = new Phone[3];
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;

		// sorting
		Phone tmp;
		for (int j = 0; j < p.length; j++) { // 0 1 2 3 4 5 6 7
			for (int i = 0; i < p.length - 1; i++) {
				if (p[i].price < p[i + 1].price) {
					tmp = p[i];
					p[i] = p[i + 1];
					p[i + 1] = tmp;
				}
			} // 3 5 6 7 8 9 11
		}

		System.out.println("Name  Price Qty  MaxDiscount");
		p[0].printData();
		p[1].printData();
		p[2].printData();

		System.out.println("================customer==============================");
		System.out.println("1 For " + p[0].name);
		System.out.println("2 For " + p[1].name);
		System.out.println("3 For " + p[2].name);
		System.out.println("enter your choice");
		int choice = scr.nextInt();
		switch (choice) {
		case 1:
			p[0].purchase();
			break;
		case 2:
			p[1].purchase();
			break;
		case 3:
			p[2].purchase();
			break;
		}
	}
}

class Phone {

	String name;
	int qty;
	int price;
	int maxDiscount;

	Scanner scr = new Scanner(System.in);

	void getData() {
		System.out.println("Enter name qty price");
		name = scr.next();
		qty = scr.nextInt();
		price = scr.nextInt();

		if (price >= 50000) {
			maxDiscount = 5000;
		} else if (price >= 25000) {
			maxDiscount = 3000;
		} else {
//			System.out.println("Enter maxDiscount");
			maxDiscount = 500;
		}
	}

	void printData() {
		System.out.println(name + "   " + price + "   " + qty + "   " + maxDiscount);
	}

	void purchase() {

		System.out.println("you are buying ---> " + name);
		System.out.println("price --> " + price);
		System.out.println("your discount ---> " + maxDiscount);
		System.out.println("final price for 1 phone  --> " + (price - maxDiscount));

		System.out.println("how many qty you want to purchase?");
		int x = scr.nextInt();
		qty = qty - x; // deduct from origin stock
	}
}
