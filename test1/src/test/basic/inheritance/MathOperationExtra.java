package test.basic.inheritance;

public class MathOperationExtra extends MathOperation {

	public MathOperationExtra(int value1, int value2) {
		super(value1, value2);
	}
	
	public int multiplication() {
		return getValue1() * getValue2();
	}
	
	//Same signature (return type, parameters) same  - then method is getting called of actual object type = method overriding
	public int addition() {
		return getValue1() + getValue2() + 1;
	}
	
	public int addition(int x) {
		return getValue1() + getValue2() + x;
	}
	
	public static void main(String[] args) {
		
		//Create object of any other class e.g. MathOperation using parameterized constructor.
		MathOperation mathOperation = new MathOperation(5,  3);
		System.out.println("mathOperation : " + mathOperation.addition());
		System.out.println("mathOperation : " + mathOperation.substurction());
		
		//Create object of any other class using default constructor and use setter to set values to private variables.
		MathOperation mathOp = new MathOperation();
		mathOp.setValue1(3);
		mathOp.setValue2(4);
		System.out.println("mathOp : " + mathOp.addition());
		System.out.println("mathOp : " + mathOp.substurction());
		
		//Create a object of subclass and call superclass's constructor using super keyword.
		MathOperationExtra mathOpExtra = new MathOperationExtra(6,  3);
		System.out.println("mathOpExtra : " + mathOpExtra.addition());
		System.out.println("mathOpExtra : " + mathOpExtra.substurction());
		System.out.println("mathOpExtra : " + mathOpExtra.multiplication());
		
		//This is key concept of inheritance that is called IS-a relationship.
		MathOperation mathOpExtraPM = new MathOperationExtra(9,  2);
		System.out.println("mathOpExtraPM : " + mathOpExtraPM.addition());
		System.out.println("mathOpExtraPM : " + mathOpExtraPM.substurction());
		System.out.println("mathOpExtraPM : " + ((MathOperationExtra) mathOpExtraPM).multiplication());
		
		
		//System.out.println(mathOpExtraPM.getClass().getName());
	}

}
