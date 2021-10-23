
public class StaticDemo {

	public static void main(String[] args) {

		//
		Bank.sub();

	}
}

class Bank {

	int balance;// instance variable or non static variable
	static int branchCode;// static variable

	// non static or instance method
	void wid() {
		int k; // local variable
		System.out.println("wid()");
//		sub(); // oky 
	}

	// static method
	static void sub() {
		System.out.println("sub()");
//		wid(); // compiler error 
	}

}
