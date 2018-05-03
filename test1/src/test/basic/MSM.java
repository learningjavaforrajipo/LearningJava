package test.basic;

public class MSM {
	
	private int varInt;
	private double tempFloat;
	private double firstDouble;
	private double secondDouble;
	private double fristDouble;
	
	private Double doubleObj;
	private String strObj;
		
	//Default constructor
	public MSM(double firstDouble, double secondDouble) {
		this.fristDouble = firstDouble;
		this.secondDouble = secondDouble;
	}
	
	public MSM(Double d, String s) {
		this.doubleObj = d;
		this.strObj = s;
	}

	//Parameterized constructor
	public MSM (double tempFloat) {
		this.tempFloat = tempFloat;
	}
	/*public MSM(int varInt) {
		this.varInt = varInt;
	}*/
	
	//TODO:
	//use all types of primitives like float, char..etc and make a example in this file or seprate
	
	public double doubleTheFloat() {
		return this.tempFloat * 2;
	}
	public double findBiggerDouble() {
		if (firstDouble > secondDouble)
			return firstDouble;
		else
			return secondDouble;
	}
	public int getFiveMultiplier() {
		return this.varInt * 5;
	}
	
	public Double getDoubleObj() {
		return doubleObj;
	}

	public void setDoubleObj(Double doubleObj) {
		this.doubleObj = doubleObj;
	}
	
	public String getStrObj() {
		return strObj;
	}

	public void setStrObj(String strObj) {
		this.strObj = strObj;
	}
	
	public void setFirstDouble(double fd) {
		this.firstDouble = fd;
	}

	public static void main(String[] args) {
		
	    //MSM msm1 = new MSM(62.50f);
		MSM msm = new MSM(5d);
		MSM msm2 = new MSM (123.5, 12346);
		//https://www.javatpoint.com/wrapper-class-in-java
		MSM msm3 = new MSM (new Double("123.5"), "ABC");
		msm3.setFirstDouble(123.5);
		System.out.println("msm3.checkDoubleVSdouble() : " + msm3.checkDoubleVSdouble());
		//System.out.println(msm1.doubleTheFloat());
		System.out.println(msm.getFiveMultiplier());
		System.out.println(msm2.findBiggerDouble());
		System.out.println("Jai Swaminarayan");
		
		
	}

	private boolean checkDoubleVSdouble() {
		if(this.firstDouble == this.doubleObj)
			return true;
		else
			return false;
	}
}
