package test.basic;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
public class Exe8FileIO {
	public static void main(String[] args) throws IOException {
		FileWriter writeIN = new FileWriter ("files/in.txt");
		
		writeIN.write("raja1|patel1|31|1111111111|abc1@xyz.com");
		writeIN.write("\n");
		writeIN.write("raja2|patel2|32|2222222222|abc2@xyz.com");
		writeIN.write("\n");
		writeIN.write("raja3|patel3|33|3333333333|abc3@xyz.com");
		writeIN.write("\n");
		writeIN.write("raja4|patel4|34|4444444444|abc4@xyz.com");
		writeIN.write("\n");
		writeIN.write("raja5|patel5|35|5555555555|abc5@xyz.com");
		writeIN.close();
		
		FileReader readIN = new FileReader("files/in.txt");
	    BufferedReader buffRIN = new BufferedReader(readIN);
	    String lineFromIN;
        String [] strOut;
        FileWriter writeFName = new FileWriter ("files/FName.txt");
    	FileWriter writeLName = new FileWriter ("files/LName.txt");
    	FileWriter writeAge = new FileWriter ("files/Age.txt");
    	FileWriter writeFNumber = new FileWriter ("files/FNumber.txt");
    	FileWriter writeEmail = new FileWriter ("files/Email.txt");
    	
    	Map<String, FileWriter> mapObj = new HashMap<String, FileWriter>();
    	mapObj.put("writeFName", writeFName);
    	
    	
        while( (lineFromIN = buffRIN.readLine()) != null ){
        	System.out.println(lineFromIN);
        	strOut = lineFromIN.split("\\|");
        	System.out.println(strOut);
        	
        		writeFName.write(strOut[0] + "\n");
        		
        		writeLName.write(strOut[1] +  "\n");
        		
        		writeAge.write(strOut[2] + "\n");
        		
        		writeFNumber.write(strOut[3] + "\n");
        		
        		writeEmail.write(strOut[4] + "\n");
        		
        	
        }
        writeFName.close();
    	writeLName.close();
    	writeAge.close();
    	writeFNumber.close();
    	writeEmail.close();
    	buffRIN.close();	
        
	}

}
