
public class ConstructorDemo {

	public static void main(String[] args) {
		Royal r = new Royal();
		r.printData();
	}
}

class Royal {

	//
	// byte -> daya type
	// b -> variable -> data name

	byte b;//0
	short s;//0
	char c;//null char-> '\u0000' 
	int i;//0 
	long l;//0
	float f;//0.0
	double d;//0.0
	boolean bb;//false

	void printData() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);
	}

}
