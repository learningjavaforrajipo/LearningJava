package test.basic;

import java.util.Scanner;

public class ReadFromConsoleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTest stringTest = new StringTest();
		stringTest.revPrint(sc.nextLine());
		sc.close();
	}
}
