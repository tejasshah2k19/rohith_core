public class Calc {
	// variable - methods
	int n1, n2, ans; // variable  - instance variable 
	
	void add() {
		int k; //local variable 
		n1 = 20;
		n2 = 30;
		ans = n1 + n2;
		System.out.println("Addition = " + ans);
	}
	public static void main(String[] args) {
		// printf()
		// cout
		// System - class
		// out - instance
//		System.out.println("Welcome...");
//		System.out.println("Royal");
		Calc obj; //declaration 
		obj = new Calc(); //init  //-->12 byte  
		Calc obj2  = new Calc();  // -> 12 byte 
		obj2.add();
	
		obj.n1 = 1000;
		obj2.n1 = 5000; 
		System.out.println(obj.n1);
		System.out.println(obj2.n1);
		
	}
}

//javac Calc.java -> Calc.class 
//java Calc 
class A {

}

class B {

}
