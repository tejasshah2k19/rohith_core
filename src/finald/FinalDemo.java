package finald;

public class FinalDemo {
	public static void main(String[] args) {

	}
}

final class A {

}
//final class can not inherited 
//class B extends A{
//
//}

class X {
	final void add() {

	}

	void sub() {

	}
}

class Y extends X {
	// final method can not override by child class
	// void add() {
//
//	}
}

class P {
	int x;
	final int j = 90;
	final int l;

	P() {
		l = 90;
	}

	void add() {
		x = 90;
		// final variable can not modified
//		j = 900;
	}
}
