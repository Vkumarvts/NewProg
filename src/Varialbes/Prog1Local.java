package Varialbes;

public class Prog1Local {
	
	static int d=20; //static global variables
	int e=30,g;;        // non-static global variables
	public static void add()
	{
		int a=10,b=15,c; //local variables
		c=a+b;
		System.out.println("A="+a);
		System.out.println("addition="+c);
		System.out.println("D is add method="+d);
	}
	public void mul()
	{
		g=d*e; //we can give value everywhere
		System.out.println("this is mul method");
		System.out.println("D="+d);
		System.out.println("G="+g);
	}

	public static void main(String[] args) {
		add();
	//	System.out.println("A="+a);
		System.out.println("D in main method="+d);
		Prog1Local f=new Prog1Local();
		f.mul();
		

	}

}
