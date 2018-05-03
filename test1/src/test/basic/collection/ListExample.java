package test.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("Raja");
		strList.add("PB Hiren");
		strList.add("Bapu Swami");
		
		
		//way 1 = for loop
		System.out.println("way 1 = for loop \n");
		for(String str : strList) {
			System.out.println(str);
		}
		
		//way 2 -Iterator
		System.out.println("\n way 2 -Iterator \n");
		Iterator<String> strListItr = strList.iterator();
		while(strListItr.hasNext()) {
			String str = strListItr.next();
			System.out.println(str);
		}
		
		//way3- simple for loop
		System.out.println("\nway3- simple for loop\n");
		for(int index=0; index<strList.size(); index++) {
			System.out.println(strList.get(index));
		}
		
		System.out.println(strList.indexOf("Bapu Swami"));
		
		//Exercise1 - create a list with atleast 10 values and keep PB in 2-3 values , Remove all list values that has PB 
		//remove thaya pachhi print karjo
		
		List<String> strList1 = new ArrayList<String>();
		strList1.add("Jayesh");
		strList1.add("Sevak Diniyo");
		strList.addAll(strList1);
		
		strList.add(2, "PB Bapu Swami");

		System.out.println("\nAdd All example\n");
		for(int index=0; index<strList.size(); index++) {
			System.out.println(strList.get(index));
		}
		
		//Count from list - containing "Bapu"
		
		//Move all String containing Bapu to another list.
		
		
		
		//add
		//addAll
		//Iterator or for-each
		//Remove
		
		
		
	}

}
