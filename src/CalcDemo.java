import java.util.*;

public class CalcDemo {
	int n1, n2, ans;// instance variable
	Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		CalcDemo obj = new CalcDemo();
//		obj.add();
//		obj.sub();
//		obj.mul();
		Scanner scr = new Scanner(System.in);

		while (true) {
			System.out.println(
					"Press 1 For Add\n2 For Sub\n3 For Mul\n4 For Sqrt\n5 For Sin\n6 for Exit\nEnter your choice");
			int choice = scr.nextInt();

			switch (choice) {
			case 1:
				obj.add();
				break;
			case 2:
				obj.sub();
				break;
			case 3:
				obj.mul();
				break;
			case 3 + 1:
				obj.sqrt();
				break;
			case 5:
				obj.sin();
				break;
			case 6:
				System.out.println("Thank you for using our Services...");
				System.exit(0);
			}
		} // loop
	}

	void add() {
		System.out.println("Please Enter Two numebrs");
		n1 = scr.nextInt();// int
		n2 = scr.nextInt();
		ans = n1 + n2;
		System.out.println("Addition = " + ans);
	}

	void sub() {
		System.out.println("Please Enter Two numebrs");
		n1 = scr.nextInt();// int
		n2 = scr.nextInt();
		ans = n1 - n2;
		System.out.println("Subtraction = " + ans);
	}

	void mul() {
		System.out.println("Please Enter Two numebrs");
		n1 = scr.nextInt();// int
		n2 = scr.nextInt();
		ans = n1 * n2;
		System.out.println("Multiplication = " + ans);
	}

	void sqrt() {
		System.out.println("Enter number to find sqrt");
		n1 = scr.nextInt();
		double ans = Math.sqrt(n1);
		System.out.println("Sqrt => " + ans);
	}

	void sin() {
		System.out.println("Enter number to find sin");
		n1 = scr.nextInt();
		double ans = Math.sin(n1);
		System.out.println("Sin => " + ans);
	}

}
