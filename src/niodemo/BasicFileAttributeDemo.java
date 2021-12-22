package niodemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class BasicFileAttributeDemo {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("d://abc//data.txt");

		BasicFileAttributes attr = Files.readAttributes(p, BasicFileAttributes.class);

		System.out.println(attr.isDirectory());// true / false
		System.out.println(attr.isRegularFile());
		System.out.println(attr.lastAccessTime());
		System.out.println(attr.lastModifiedTime());

		DosFileAttributes dosAttr = Files.readAttributes(p, DosFileAttributes.class);
		System.out.println(dosAttr.isReadOnly());

//		PosixFileAttributes

	}
}
