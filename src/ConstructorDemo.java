
public class ConstructorDemo {

	public static void main(String[] args) {
//		Royal r = new Royal(250, true);
//		r.printData();
		Royal r1 = new Royal(250);
		System.out.println(r1.i);
		System.out.println(r1.bb);
	}
	
}

class Royal {

	//
	// byte -> daya type
	// b -> variable -> data name

	// instance variable
	byte b;// 0
	short s;// 0
	char c;// null char-> '\u0000'
	int i;// 0
	long l;// 0 // balance
	float f;// 0.0
	double d;// 0.0
	boolean bb;// false

	// explicit -1
	// no argument / default
	Royal() {
		bb = true;
		i = 100;
		System.out.println("Royal()");
	}

	// expilicit -2
	Royal(int k) { //250 
		this(12,true);//
		i = k;//
		System.out.println("Royal(int)");
	}

	// expilicit -2
	Royal(int k, boolean j) {//12,true
		this();//
		i = k;//
		bb = j;
		System.out.println("Royal(int,boolean)");

	}

	// expilicit -2
	Royal(int k, boolean j, char x) {
		i = k;//
		bb = j;
		c = x;
		System.out.println("Royal(int,boolean,char)");

	}

	// this method will print all data on console
	void printData() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);// XXXXX
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);
	}

}
