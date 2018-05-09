package test.basic;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//use charAT
//use lastIndexOf
//substr
public class Exe7FileIO {
	public static void main(String[] args) throws IOException {
		//File ipfile = new File("files/temp.txt");
		
		FileWriter write = new FileWriter ("files/temp.txt");
		FileWriter write1 = new FileWriter ("files/tempOUT1.txt");
		FileWriter write2 = new FileWriter ("files/tempOUT2.txt");
		write.write("Jai Swaminarayan#Mahant Swami Maharaj ni Jay");
		write.close();  
		 FileReader read1 = new FileReader("files/temp.txt");
		    BufferedReader buffRead1 = new BufferedReader(read1);
	        
		    
	        String lineToRead;
	        String [] strOut;
	        while( (lineToRead = buffRead1.readLine()) != null) {
	        	System.out.println(lineToRead);
	        	strOut = lineToRead.split("#");
	        	String line1 = strOut[0];
		        String line2 = strOut[1];
		        
		        write1.write(line1);
		        FileReader read2 = new FileReader("files/tempOUT1.txt");
		        BufferedReader buffRead2 = new BufferedReader(read2);
		        
		        while( (lineToRead = buffRead2.readLine()) != null) {
		        	System.out.println(lineToRead);
		        	buffRead2.close();
		        }	
		        
		        write2.write(line2);
		        FileReader read3 = new FileReader("files/tempOUT2.txt");
		        BufferedReader buffRead3 = new BufferedReader(read3); 
		        while( (lineToRead = buffRead3.readLine()) != null) {
		        	System.out.println(lineToRead);
		        	buffRead3.close();
		        }
	        }
	        buffRead1.close();
	        
	        
	        write1.close();
	        write2.close();
	}

}
