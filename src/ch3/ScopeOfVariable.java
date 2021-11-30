package ch3;

public class ScopeOfVariable {

	public static void main(String[] args) {
		Court c = new Court();
		c.b = 90;
		System.out.println(c.b);

		c.b = (byte) (129);//-128 to 127 
		System.out.println(c.b);
	}
}

class Court {
	int justice;// instance
	static int gov;// static-class
	byte b;

	void advocate() {
		int bill; // local

		// i ==> block
		for (int i = 1; i <= 56; i++) {

		}

		// i => print => i --> compilation error
	}
}
