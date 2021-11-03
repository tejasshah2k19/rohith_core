package string;

public class StringDemo {

	public static void main(String[] args) {

		String s = new String("royal");
		String s1 = "royal";
		String s3 = "royal";
		String s4 = new String("royal");

		if (s == s1) {
			System.out.println("s == s1");
		}

		if (s == s3) {
			System.out.println("s == s3");
		}

		if (s == s4) {
			System.out.println("s == s4");
		}

		System.out.println("-------------------");

		if (s1 == s3) {
			System.out.println("s1 == s3");
		}

	}
}
