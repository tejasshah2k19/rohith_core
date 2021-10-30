package array;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {

		int a[] = new int[5];// a -> 5 primitive -> int
		char b[] = new char[5];// nb -> 5 primitive -> char
		String s[] = new String[5]; // s -> 5 non-primitive -> String

		int i,search,count=0;

		Scanner scr = new Scanner(System.in);
		
		for (i = 0; i < a.length; i++) {
			System.out.println("Enter number");
			a[i] = scr.nextInt(); // 10 20 30 40 50 
		}

		System.out.println("Enter number that you want to search?");
		search = scr.nextInt(); // 60 
		
		 for(i=0;i<a.length;i++) {//0 1 2 3 4 
			 if(a[i] == search) { // if any index value matches with the search -> true | false  
				 count++; //  increase value of counter by 1 
			 }
		 }
		 
		System.out.println(count); //print value of count --> 2 
		
		
		
	}
}
