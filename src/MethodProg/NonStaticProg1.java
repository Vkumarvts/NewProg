package MethodProg;

public class NonStaticProg1 {
	
	public void add1()
	{
		System.out.println(10+10); //this is not good practice
	}
	public void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("addition="+c);
	}

}
