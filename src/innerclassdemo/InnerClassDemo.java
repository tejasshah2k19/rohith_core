package innerclassdemo;

import java.util.TreeMap;
import java.util.TreeSet;

public class InnerClassDemo {

	public static void main(String[] args) {
//		A a = new A();
//
//		A.B objB = new A().new B();
//		A.B objB2 = a.new B();
//
//		objB.add();

		A a = new A();
		a.accessAdd();

		A.C objC = new A.C();

		A.accessSub();

		a.createInnnerClass();
	}
}

class A {
	// reduce visibility -> it increase encapsulation
	class B { // innner class
		void add() {
			System.out.println("add()");
		}
	}

	void accessAdd() {
		B b = new B();
		b.add();
	}

	static class C { // nested class
		static void sub() {
			System.out.println("sub()");
		}
	}

	static void accessSub() {
		C.sub();
	}

	// method local inner class
	void createInnnerClass() {
		class D {
			void mul() {
				System.out.println("mul()");
			}
		}

		D d = new D();
		d.mul();
	}

}
