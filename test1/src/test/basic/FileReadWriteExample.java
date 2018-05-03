package test.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
	public static void main(String[] args) throws IOException {
		
		//Write to file
		/*File file = new File("files"+File.separator+"temp.txt");*/
		File file = new File("files/temp.txt");
		System.out.println("aa file chhe : " + file.isFile());
		/*File file = new File("files\\temp.txt");*/
		/*String str = "Jai Swaminarayan 1234";
		FileOutputStream fileOut = new FileOutputStream(hirenRaja);
		fileOut.write(str.getBytes());
		fileOut.close();*/
		
		FileWriter fw = new FileWriter(file);
		fw.write("Jay Swaminaryan - Bapa");
		fw.write("\n");
		fw.write("Bapa - 1234");
		fw.write("\n");
		fw.write("Swami - 1234");
		fw.close();
		
		//Another way to write
		/*PrintWriter pw = new PrintWriter(hirenRaja);
		pw.write(str);*/
		
		/*FileReader reader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        reader.read(chars);
        String  content = new String(chars);
        System.out.println(content);
        reader.close();*/
        
        FileReader fr1 = new FileReader("files/temp.txt");
        BufferedReader br = new BufferedReader(fr1);
        String lineToRead;
        while( (lineToRead = br.readLine()) != null) {
        	System.out.println(lineToRead);
        }
        br.close();
	}
}
