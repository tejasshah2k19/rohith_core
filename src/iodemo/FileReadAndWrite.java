package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException {

		readAllFileData();
		System.out.println("done");

	}

	static void createFileAndWriteData() throws IOException {

		// created file
		File f = new File("d://abc//data.txt");
		f.createNewFile();

		// write some data in file
//		FileWriter fw = new FileWriter(f);
//		fw.write("royaleducation");
//		fw.close();

		String str = "";
		Scanner scr = new Scanner(System.in);
		System.out.println("enter data");
		str = scr.next();

		FileWriter fw = new FileWriter(f);
		fw.write(str);
		fw.close();

	}

	static void readFileData() throws IOException {
		File f = new File("d://abc//data.txt");
		FileInputStream fis = new FileInputStream(f);

		int b = fis.read(); // read single character from file and return it's UNICODE value
		System.out.println((char) b);

		b = fis.read();// second character
		System.out.println((char) b);

		fis.close();

	}

	static void readAllFileData() throws IOException {
		File f = new File("d://abc//data.txt");
		FileInputStream fis = new FileInputStream(f);

		int b = 0;

		while (true) {
			b = fis.read();
			if(b == -1) {
				break;
			}
			System.out.print((char) b);
		}

		fis.close();

	}

}
