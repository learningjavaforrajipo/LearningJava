package test.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {
	
	public static void main(String[] args) {
		
		ArrayList<String> gohelFamily = new ArrayList<String>();
		
		
		gohelFamily.add("Naman");
		gohelFamily.add("Aarav");
		gohelFamily.add("PB Dineshbhai");
		gohelFamily.add("Keshvi");
		gohelFamily.add("PB Jayeshbhai");
		gohelFamily.add("Mrs Jayeshbhai");
		gohelFamily.add("Mrs Dineshbhai");
		gohelFamily.add("PB Hasudada");
		gohelFamily.add("Om");
		gohelFamily.add("PB Rajukaka");
		gohelFamily.add("Masi");
		gohelFamily.add("Mrs Rajukaka");
		
		System.out.println("Members of Gohel Family \n \n" );
		for(String str : gohelFamily) {
			System.out.println(str);
		}
		List<String> pbList = new ArrayList<String>();
		int count = 0;
		for(String str : gohelFamily) {
			boolean b = str.contains("PB") ;
			if(b == true) {
				pbList.add(str);
				count++;
			}

		}

		System.out.println("\n" + count + " Members of Gohel Family have PB as salutation:\n " );
		
		for(String str : pbList) {
			System.out.println(str);
		}
		
		List<String> tempList = new ArrayList<String>();
		for(String str : gohelFamily) {
			boolean b = str.contains("PB") ;
			if(b == false) {
				tempList.add(str);
			}

		}
		
		System.out.println("\n After removing PB \n\n");
				
		for(String str : tempList) {
			System.out.println(str);
		}

	}
	

}
