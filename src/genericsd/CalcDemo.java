package genericsd;

public class CalcDemo<T> {

	// Object
	void add(T f, T g) {
		System.out.println("add()");
	}

	public static void main(String[] args) {
		CalcDemo<Integer> c = new CalcDemo<>();
		c.add(10, 20);

		CalcDemo<String> c1 = new CalcDemo<>();
		c1.add("tejas", "shah");

		CalcDemo<Float> c2 = new CalcDemo<>();
		c2.add(20.20f, 20.20f);

		Abcd<String, Integer> ab = new Abcd<>();
		Abcd<String, String> abv = new Abcd<>();
	}
}

class Abcd<T, K> {
	T y;
	K x;
}
