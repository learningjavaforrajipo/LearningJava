package test.basic;

public class ExceptionTest2 {
	
	public ExceptionTest2() {}
	
	public int getValue() {
		try {
			char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
			System.out.println(matrix[5]);
			return 1;
		}catch(Exception hasudada) {
			hasudada.printStackTrace();
			return 2;
		}
		finally {
			return 3;
		}
	}
	public static void main(String[] args) {
		ExceptionTest2 et = new ExceptionTest2();
		System.out.println(et.getValue());
	}
}
