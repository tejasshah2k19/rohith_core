package oop;

public class PolymorphicDemo {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.walk();// Dog:Walk
		d.fight();// Animal:Fight
		d.bite(); // Dog:bite
		Cow c = new Cow();
		c.walk();// Cow:Walk
		c.fight();// Cow:Fight

		Animal a = new Dog(); // Parent p = new Child() ---> polymorphic object
		a.walk();// Dog:Walk
		a.fight(); // Animal:Fight
		// a.bite(); // compilation
	}

}

class Animal {
	void walk() {
		System.out.println("Animal:Walk()");
	}

	void fight() {
		System.out.println("Animal:fight()");
	}
}

class Dog extends Animal {
	void walk() {
		System.out.println("Dog:Walk()");
	}

	void bite() {
		System.out.println("Dog:bite()");
	}

}

class Cow extends Animal {
	void walk() {
		System.out.println("Cow:Walk()");
	}

	void fight() {
		System.out.println("Cow:fight()");
	}

}
