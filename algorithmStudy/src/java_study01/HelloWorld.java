package java_study01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloWorld {
	public static void main(String[] args) {
		
		File file = new File("./src/step_05/", "helloWorld.txt");
		File copy = new File("./src/step_05/", "helloCopy.txt");
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		try {
			
			fis = new FileInputStream(file);
			fos = new FileOutputStream(copy);
			
			while( (len = fis.read(buf)) != -1 ) {
				
				fos.write(buf, 0, len);
				
			}
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
