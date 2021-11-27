package oop;

public class InitBlockDemo {

	public static void main(String[] args) {
		System.out.println("main method");

		School sc = new School();
		School sc1 = new School();
		
	}
}

class School {

	String name;
	static int schoolCode;

	School() {
		name = "education";
		System.out.println("School() - constructor");
	}

	// instance block
	{
		name = "education2";
		System.out.println("instance block");
	}

	// static block
	static {
		schoolCode = 123;
		System.out.println("static block");
	}
}
