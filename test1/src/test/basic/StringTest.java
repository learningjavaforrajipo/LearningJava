package test.basic;

import java.util.HashMap;
import java.util.Map;

public class StringTest {
	private String str;
	private String [] stArries;
	
	//Default Constructor
	public StringTest() {}
	
	//Parameterized Constructor
	public StringTest(String str1) {
		this.str = str1;
	}
	
	//ex1 - check if char is part of string
	public boolean checkIfCharWithinString(String sourceStr, String charToFind) {
		this.str = sourceStr;
		if(str.indexOf(charToFind) != -1) {
			return true;
		}
		else {
			return false;
		}
	}	
	
	public String getStr() {
		return this.str;
	}
	
	public void setStr(String newStr) {
		this.str = newStr;
	}
	// ex2
	public void fancyPrint(String dstr) {
		for(int i = 1; i <= dstr.length() ; i++ ) {
			String subStr = dstr.substring(0, i);
			System.out.println(subStr);
		}
	}
	// ex3
	public void revPrint(String rstr) {
		
		String revString = "";
		for(int i = rstr.length(); i >= 1 ; i-- ) {
			char subStr = rstr.charAt(i-1);
			revString = revString + subStr;
		}
		System.out.println("Reversed : " + revString);
		String oriStr = "";
		for(int i = revString.length(); i >= 1 ; i-- ) {
			String subStr = revString.substring(i-1, i);
			oriStr = oriStr + subStr;
		}
		System.out.println("Back to normal : " + oriStr);
		
	}
	// Ex4
	public void checkPlindromeStr(String datastring) {
		String tempstr = "";
		System.out.println("Original String : " + datastring);
		for(int i = datastring.length(); i >= 1 ; i-- ) {
			char subStr2 = datastring.charAt(i-1);
			System.out.println(subStr2);
			tempstr = tempstr + subStr2;
		}
		
		System.out.println("Reversed String : " + tempstr);
		
		if(datastring.equals(tempstr)) {
			System.out.println("True");
		}
		
		int t1 = datastring.compareTo(tempstr);
		int t2 = datastring.compareToIgnoreCase(tempstr);
		if ( t1 != 0 ) {
			System.out.println(datastring + " is not Palindrome string.");	
			if (t2 != 0 ) {
				System.out.println(datastring + " is also not Palindrome string with ignoring case.");
			}
			else
				System.out.println("But, " + datastring + " is Palindrome string with ignoring case.");
		}
		else
			System.out.println(datastring + " is Palindrome string.");
	}
	//ex5
	public void creatingStrArray(String inputStr, String strSeprator) {
		String[] str = inputStr.split(strSeprator);
		for(int i = 0 ; i< str.length; i++) {
			System.out.println(str[i]);
		}
		
		/*String stArries[] = new String[5];
		int x = 0;
		int arrayIndex = 0;
		while( x != -1){
			x = inputStr.indexOf(strSeprator);
			String subString = "";
			subString = inputStr.substring(0, x);
			inputStr = inputStr.substring(x+1);
			stArries[arrayIndex] = subString;
			arrayIndex++;
			subString = inputStr;
		} 
			stArries[arrayIndex + 1] = inputStr;
		
					inputStr = inputStr.replaceAll(subString, "");
			inputStr = inputStr.replaceFirst(strSeprator, "");
			
			for(int i = 0; i < stArries.length; i++) {
			System.out.println(stArries[i]);
		}*/
	}
	
	//ex6
	public void removSpace(String stringWitnSpaces) {
				for(int j =0; j<3; j++) {
			stringWitnSpaces = stringWitnSpaces.replaceAll("  ", " ");
		}
		System.out.println(stringWitnSpaces);
		
	}
	
	//ex7
	public void countChar(String strToCharCount) {
		
		for (int i = 0; i < strToCharCount.length(); i++) {
			int count = 0;
			for (int j = 0; j < strToCharCount.length(); j++) {
				if (strToCharCount.charAt(i) == strToCharCount.charAt(j)) {
					count += 1;
				}
			}
			System.out.println("Total number of accurance of " + strToCharCount.charAt(i) + " in given string is " + count);
			/*for(int k = i-1; k > 0; k--) {
				if (strToCharCount.charAt(i) != strToCharCount.charAt(k)) {
				System.out.println("Total number of accurance of " + strToCharCount.charAt(i) + " in given string is " + count);
				}
			}*/
			
		}
		
		Map<String, Integer> map = new HashMap();
			
	}
	
	//ex8
	public void replacingStr(String strNeedsReplcmnt, String strToBeRemove, String strToBeInsert) {
		String[] strArray = strNeedsReplcmnt.split(strToBeRemove);
		for(int i = 0 ; i< strArray.length; i++) {
			System.out.print(strArray[i] + strToBeInsert);
		}
		
	}
	//Main 
	public static void main(String[] args) {
		StringTest strTestObj = new StringTest();
		
		/*System.out.println(strTestObj.checkIfCharWithinString("hiren", "r"));
		System.out.println(strTestObj.checkIfCharWithinString("hiren", "p"));
		
		strTestObj.setStr("NewRaja");
		
		System.out.println(strTestObj.getStr());
		
		System.out.println(strTestObj.checkIfCharWithinString(strTestObj.getStr(), "r"));
		
		strTestObj.fancyPrint("PBHIRENBHAI");
		
		strTestObj.revPrint("SWAMI");*/
		//strTestObj.checkPlindromeStr("HIREN");
		//strTestObj.checkPlindromeStr("Naman");
		//strTestObj.creatingStrArray("Dinesh,gohel,etobicoke,nort,toronto", ",");
		//strTestObj.removSpace("Dinesh    is my  teacher.");
		strTestObj.countChar("swami bapa");
		strTestObj.replacingStr("Dinesh,gohel,etobicoke,north,toronto", ","," ");
	}
}
