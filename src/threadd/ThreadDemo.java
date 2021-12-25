package threadd;

public class ThreadDemo {

	public static void main(String[] args) {

		Copy c = new Copy();
		Print p = new Print();
		c.start();//
		p.start();//
	}
}

class Copy extends Thread {

	public void run() {
		for (int i = 1; i <= 12; i++) {
			System.out.println("copy===> " + i);
		}
	}
}

class Print extends Thread {
	public void run() {
		for (int i = 1; i <= 12; i++) {
			System.out.println("print===> " + i);
		}
	}
}

//process--> 12 gb -> 12 part --> 1 2 3 4 5 6 7 8 9 10 11 12 -> threads   ==> 1 thread ==> 1gb 

//movie --> 2gb --> 4 part --> 1 2 3 4 --> 1 thread 

//movie , eclipse ,  => 12 gb 
//8 gb -> 12 gb 