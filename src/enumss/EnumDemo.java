package enumss;

public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Drink.LARGE.value);// 22
		System.out.println(Mobile.Rates.SMS);//

		Drink abc = Drink.SMALL;

	}
}

enum Drink {
	SMALL(1), LARGE(2), EXLARGE(4);
	int value;

	Drink(int v) {
		value = v;
	}
}

class Mobile {
	enum Rates {
		SMS, MMS, NET, CALL;
	}
}