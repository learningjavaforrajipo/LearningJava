package test.basic;

public class SwapingNumbers {
	
	private int x;
	private int y;

	public SwapingNumbers() {}
	public void SwapingNumbers(int a, int b) {
		this.x = a;
		this.y =  b;
	}
	
	public void swapingNumberUsingThirdVariable(int var1, int var2) {
		
		System.out.println("The first number is " + var1 + " and the second number is " + var2);
		int temp;
		temp = var1;
		var1 = var2;
		var2 = temp;
		System.out.println("After swaping first number is " + var1 + " and the second number is " + var2);
	}
	
	public void swapingNumberWithoutUsingThirdVariable(int num1, int num2) {
		System.out.println("The first number is " + num1 + " and the second number is " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swaping number is " + num1 + " and the second number is " + num2);
	}
	
	public static void main(String[] args) {
		SwapingNumbers myobj = new SwapingNumbers();
		
		myobj.swapingNumberUsingThirdVariable(11, 22);
		myobj.swapingNumberWithoutUsingThirdVariable(00, 99);
	
		
	}
		
		
		
}


