package oop;

public class CastingDemo {

	public static void main(String[] args) {

		X x = null;
		Y y = new Y();
		x = y;

		X y1 = new Y();

//		Y y = new X();

		Y y2 = null;
//		X x2 = new X();
//		y2 = (Y) (x2);

		
		Y y3 = new Y();
		
		((X)y3).add();
	}

}

class X {
	void add() {
		System.out.println("X::add()");
	}
}

class Y extends X {

	void add() {
		System.out.println("Y::add()");
	}

	void sub() {
		System.out.println("Y::sub");
	}
}

class XY extends Y {

}
