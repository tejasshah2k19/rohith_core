
public class AbstractDemo {

	public static void main(String[] args) {
		ICICI i = new ICICI();
		i.wid();
		i.add();
	}
}

abstract class RBI {

	abstract void wid();// only declaration -- no defination

	void add() {
		System.out.println("add()");
	}
}
//in abstraction --child class must have to override abstract method of parent abstract class 
//or you can add abstract keyword in child class
class ICICI extends RBI {
	//overriding --
	void wid() {
		System.out.println("ICICI::wid()");
	}
}