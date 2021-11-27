package oop;

public class LegalReturnType {

	public static void main(String[] args) {

	}
}

class Game {
	Number play() {
		System.out.println("Game::play");
		return 0;
	}
}

class Cricket extends Game {
	// all signature same
	Float play() {
		System.out.println("Cricket::play");
		return 0.0f;
	}
}

//which object oriented concept represent here by play method?
//parent - child [ Game - Cricket]