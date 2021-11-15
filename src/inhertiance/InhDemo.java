package inhertiance;

public class InhDemo {

	public static void main(String[] args) {
//		BasicCalc b = new BasicCalc();
//		b.add();
//		b.sub();

		SciCalc sc = new SciCalc();
		sc.sin();
		sc.add();// ???
		sc.sub();
	}
}

class BasicCalc {

	// default
	void add() {
		System.out.println("BasicCalc::add()");
	}

	void sub() {
		System.out.println("BasicCalc::sub()");
	}
}

class SciCalc extends BasicCalc {
	// overriding
	void add() {
		System.out.println("SciCalc::add()");
	}

	//Overloading 
	void sub(int k) {
		System.out.println("SciCal::sub(int)");
	}
	
	void sin() {
		System.out.println("SciCalc::sin()");
	}
}