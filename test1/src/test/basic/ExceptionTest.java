package test.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
	public static void main(String[] args) {
		
		try {
			/*File file = new File("abc");
			FileReader fr = new FileReader(file);*/
			
			char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
			System.out.println(matrix[5]);
		}
		catch(ArrayIndexOutOfBoundsException arrEx) {
			arrEx.printStackTrace();
		}
		/*catch(FileNotFoundException obj) {
			System.out.println(obj.getMessage());
			System.out.println("\n\n");
			obj.printStackTrace();
		}*/
		
	}
}
