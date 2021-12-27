package threadd;

public class ThreadWaitSync {

	public static void main(String[] args) {

		Bank b = new Bank();

		Thread t1 = new Thread(b, "santa");
		Thread t2 = new Thread(b, "banta");
		Thread t3 = new Thread(b, "manta");

		t1.start();
		t2.start();
		t3.start();

	}
}

class Bank extends Thread {

	int balance = 20000;

	public void run() {

		wid(10000);
	}

	void wid(int amount) {// synchronized

		synchronized (this) {
			if (balance >= 0 && balance - amount >= 0) {
				System.out.println("-:wid start:- " + currentThread().getName());
				this.balance = this.balance - amount;// 20000-10000-10000-10000
				System.out.println("-:wid end:- ");
			} else {
				System.out.println("insufficient balance => " + currentThread().getName());
			}
		}
	}

}
