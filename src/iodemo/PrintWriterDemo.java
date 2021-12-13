package iodemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("d:\\abc\\data123.txt");
	//	pw.write("royaleducation\n");
		//pw.write("ahmedabad");
		pw.println("royaleducation123");
		pw.println("ahmedabad");
		pw.close();
		System.out.println("END");
	}
}
