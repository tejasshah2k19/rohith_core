package threadd;

import sun.net.www.content.audio.wav;

public class ThreadWithOneClass {

	public static void main(String[] args) {

		C c = new C();

		Thread t1 = new Thread(c, "t1");
		Thread t2 = new Thread(c, "t2");
		Thread t3 = new Thread(c);
		t3.setName("t3");//

		t1.start();// +1
		t2.start();// +1
		t3.start();// 1
		// 3

//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			synchronized (c) {
				c.wait();
			}
		} catch (Exception e) {
			System.out.println("exception --> " + e.getClass());
		}


//		c.notify();
		System.out.println("counter :::===> " + c.counter);// 3
	}
}

class C extends Thread {

	int counter = 0;

	public void run() {
		//
		increment();

	}

	synchronized void increment() {
		System.out.println(currentThread().getName() + " run()");
		counter++;
		System.out.println(currentThread().getName() + "   counter => " + counter);
		notify();
	}

}
