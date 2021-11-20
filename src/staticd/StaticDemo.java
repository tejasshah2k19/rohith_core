package staticd;

public class StaticDemo {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		Bank b2 = new Bank();

		b1.balance = 123;
		b2.balance = 234;

		b1.bcode = 123;
		b2.bcode = 234;
		Bank.bcode = 567;

		System.out.println(b1.balance);// 123
		System.out.println(b2.balance);// 234

		System.out.println(b1.bcode);// 567
		System.out.println(b2.bcode);// 567

	}
}

class Bank {
	int balance;// everytime when we create instance/object
	static int bcode; // single copy in the memory

	// without creating object we can access static property.
	//
	// access via class name
	static void add() {
		System.out.println("add()");
//		System.out.println(balance); // we can't access non static property in static context 
		System.out.println(bcode);
	}
}