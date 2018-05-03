package test.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReadWriteExample2 {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fileIn = new FileInputStream("files/temp.txt");
			FileOutputStream fileOut = new FileOutputStream("files/tempOUT.txt");
			
			int cIn = fileIn.read();
			
			while(cIn != -1) {
				fileOut.write(cIn);
				cIn = fileIn.read();
			}
			
			FileInputStream fileInFortempOut = new FileInputStream("files/tempOUT.txt");
			int cOut = fileInFortempOut.read();
			
			while(cOut != -1) {
				System.out.print( (char) cOut);
				cOut = fileInFortempOut.read();
			}
			
			fileIn.close();
			fileOut.close();
			fileInFortempOut.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println("Please check path ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
    }  
	
}