package ch3;

public class PassByRefPassByValue {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.a = 10;
		c.b = 20;
		c.swap(c.a, c.b);// pass by value
		System.out.println(c.a);
		System.out.println(c.b);
	
		c.swap(c);// pass by ref
		System.out.println(c.a);
		System.out.println(c.b);
	
	}
}

class Calc {

	int a, b;

	void swap(int x, int y) {
		int tmp = x;
		x = y;
		y = tmp;
	}
	
	void swap(Calc c) {
		int tmp = c.a;
		c.a = c.b;
		c.b = tmp;
		
	}

}
