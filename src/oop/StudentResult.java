package oop;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {

		int a[] = new int[8];
		Student s[] = new Student[3];// s[0] = null s[1] = null

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student(); // allocate the memory for object s[0] s[1] ..s[299]
			s[i].getData(); // s[0] => scan data , s[1]
			s[i].calculateResult();
		}
		System.out.println(" ============== All Students ==============");
		System.out.println("Name Maths   Sci Eng    Perc   Grade");
		for (int i = 0; i < s.length; i++) {
			s[i].printData();
		}
	}
}

class Student {
	String name;
	int maths, sci, eng;
	float perc;
	char grade;

	Scanner scr = new Scanner(System.in);

	void getData() {
		System.out.println("Enter firstName and marks of three subjects");
		name = scr.next();
		maths = scr.nextInt();
		sci = scr.nextInt();
		eng = scr.nextInt();

	}

	void calculateResult() {
		perc = (maths + sci + eng) / 3;
		if (perc >= 90) {
			grade = 'A';
		} else if (perc >= 75) {
			grade = 'B';
		} else if (perc >= 35) {
			grade = 'C';
		} else {
			grade = 'F';
		}
	}

	void printData() {
		System.out.println(name + "    " + maths + "    " + sci + "    " + eng + "    " + perc + "    " + grade);
	}
}

//royal , app , calculate result of students
//student name  , maths , sci ,eng 
//perc and grade [ >90 A , >75 b , >35 C , <35 F ] 

//3 students -> 
//print all data 
