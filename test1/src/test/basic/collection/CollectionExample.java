package test.basic.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {
		
		//This is collection of unique objects
		Set<String> setObj = new HashSet<String>();
		
		setObj.add("Dinesh");
		setObj.add("Dinesh");
		
		System.out.println("size of set " + setObj.size());
		
		for (String string : setObj) {
			System.out.println(string);
		}
		
		Map<String, Integer> mapObj = new HashMap<String, Integer>();
		
		//Key set - unique
		//Value can be duplicate

		//for example
		
		mapObj.put("D", 1);
		mapObj.put("E", 2);
		
		String str = "This is an example of collection set and map";
		
		//check "P" as key in map
		
		System.out.println(mapObj.get("D"));
		System.out.println(mapObj.get("E"));
		System.out.println(mapObj.get("L"));
		
		System.out.println(mapObj.keySet());
		System.out.println(mapObj.values());
		
	}

}
