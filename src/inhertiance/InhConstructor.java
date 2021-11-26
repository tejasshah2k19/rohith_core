package inhertiance;

public class InhConstructor {

	public static void main(String[] args) {

		
		SBI s = new SBI();
//		SBI s1 = new SBI(25);
	}
}

class RBI{
	RBI(){
		this(12);
		System.out.println("RBI()");
	}
	RBI(int a){
		System.out.println("RBI(int)");
	}

}
class SBI extends RBI{
	SBI(){ 
		this(10);//SBI(int)
//		super(10);// parent's parameterized
		System.out.println("SBI()");

	}
	SBI(int a){
		System.out.println("SBI(int)");
	}
}
