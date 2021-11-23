package oop;

public class EncapDemo {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setRam(12);
		System.out.println(l.getRam());
	}
}

class Laptop {
	private int ram;

	public int getRam() {
		return ram;
	}

	public void setRam(int v) {
		ram = v;
	}
}
