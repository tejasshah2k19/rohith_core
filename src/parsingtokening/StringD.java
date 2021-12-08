package parsingtokening;

public class StringD {

	public static void main(String[] args) {
		String s = "royal1education2india3tejas";
		
		String x [] = s.split("\\d+"); //digit [0-9]
		
		for(String c:x) {
			System.out.println(c);
		}
	
	}
}
