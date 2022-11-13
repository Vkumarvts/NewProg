package MethodProg;

public class StaticProg2 {
	
	//static method with parameter from same class
	
	public static void decimalValue(double a)
	{
		System.out.println(" decimal value of a="+ a);
	}
	public static void add1(int num1,int num2)
	{
		int sum;
		sum=num1+num2;
		System.out.println("addition by method with parameter="+ sum);
	}

	public static void main(String[] args) {
		
		add1(25,30);
		decimalValue(22.33);
		

	}

}
