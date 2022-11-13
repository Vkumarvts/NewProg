package Constructor;

public class Prog2 {
	
	static int num1,num2; //static variable define in single line with one data type
	public Prog2()
	{
		num1=10;
		num2=20;
	}
	
	public Prog2(int a)
	{
		System.out.println("student marks ="+a);
	}
	
	public static void main(String[] args) {
		Prog2 x=new Prog2();
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		Prog2 y=new Prog2(100);
	}

}
