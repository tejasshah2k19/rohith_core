package oop;

public class EqualsContract {

	public static void main(String[] args) {

		// inheritance
		Test t1 = new Test();
		t1.name = "ram";
		t1.age = 200;

		System.out.println(t1);// toString()
		System.out.println(t1.toString());// toString()
		// pacak.className@memroyAddress

		Test t2 = new Test();
		t2.name = "ram";
		System.out.println(t1.equals(t2));// false
		Test t3 = t1;
		System.out.println(t1.equals(t3));// true
		// equals -->
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);

		String x1 = new String("ram");// MKL
		String x2 = new String("ram");// MKP

		System.out.println(x1 == x2);// false
		System.out.println(x1.equals(x2));// true

		System.out.println(t1);//

		String s = "rohith"; // object
		System.out.println(s);// rohith
		System.out.println(s.toString());
	}
}

class Test {
	// equals --> Object --> it compares object ---> memory => ==
	// toString ---> Object --> // pacak.className@memroyAddress

	String name;
	int age;

	// override
	public String toString() {

		return name;
	}

}
