package iodemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
//		createFolderDemo();
//		removeFileDemo();
		removeFolder();
	}

	static void createFileDemo() {
		File f = new File("d:\\abc\\data.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("filecreation error");
		} // create file if not exists - true | false
		System.out.println("file created.....");
	}

	static void checkFilePresentOrNot() {
		File f = new File("d:\\abc\\xyz.txt");// search xyz.txt only in abc folder nowhere else
		boolean x = f.exists(); // true | false

		if (x == true) {
			System.out.println("xyz.txt is present");
		} else {
			System.out.println("xyz.txt is not present");
		}

	}

	static void createFolderDemo() {
		File f = new File("d:\\abc\\demo");
		f.mkdir();// create folder ->make directory
		System.out.println("folder created");
	}

	static void removeFileDemo() {
		File f = new File("d:\\abc\\data.txt");
		f.delete(); // remove file --> true | false
		System.out.println("file deleted");
	}

	static void removeFolder() {
		File f = new File("d:\\abc\\demo");
		f.delete();
		// remove folder
		System.out.println("folder removed....");
	}

}
