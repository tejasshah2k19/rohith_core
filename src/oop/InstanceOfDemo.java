package oop;

public class InstanceOfDemo {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car instanceof Car);
		Ciaz ciaz = new Ciaz();
		System.out.println(ciaz instanceof Ciaz);
		System.out.println(ciaz instanceof Car);
		Dzire dzire = new Dzire();
		System.out.println(dzire instanceof Car);
		System.out.println(dzire instanceof Dzire);
		// System.out.println(dzire instanceof Ciaz);

	}
}

class Car {

}

class Ciaz extends Car {

}

class Dzire extends Car {

}
//K->L [yes]
//K->J [yes]
//J->L [No]
