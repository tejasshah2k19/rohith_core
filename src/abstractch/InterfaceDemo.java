package abstractch;

public class InterfaceDemo {

	public static void main(String[] args) {

	}
}

//class 
abstract class A {

}

interface GOV {
	void tax();
}

//interface -- pure abstract class  
interface SBI extends GOV {
	void add();

	abstract void sub();

	public abstract void mul();
	// 4
}

class B extends A {
	//
}

abstract class C implements SBI {
	public void add() {

	}

	public void sub() {

	}

}

class D extends C {
	public void mul() {
	}

	public void tax() {

	}
}
