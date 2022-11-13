package MethodProg;

public class StaticNonStatic {
	
	public static void add(int num1,int num2)
	{
		int sum;
		sum = num1 + num2;
		System.out.println("ddition of two numbers="+ sum);
	}
	
	public void StdClass(String name)
	{
		System.out.println("Student name ="+ name );
	}

	public static void main(String[] args) {
		
		StaticNonStatic x=new StaticNonStatic();
		x.StdClass("Ron");
		add(10,20);
	
	}

}
