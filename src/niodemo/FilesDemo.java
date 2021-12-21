package niodemo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

	public static void main(String[] args) throws Exception {

		File f = new File("rohith.txt");
		f.createNewFile(); 
		f.exists();//boolean
		f.canRead();//boolean 
		
		Path p = Paths.get("rohith.txt");
		Files.createFile(p);
		Files.exists(p);// boolean
		Files.isReadable(p); //boolean 
		
		
		//
		//
		
		//
		//
		
	}
}
