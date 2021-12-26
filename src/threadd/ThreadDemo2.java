package threadd;

public class ThreadDemo2 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(b);
		a.start();
		t1.start();

	}
}

class A extends Thread {

	public void run() {
		System.out.println("A");
	}
}

class B implements Runnable {
	public void run() {
		System.out.println("B");
	}
}
