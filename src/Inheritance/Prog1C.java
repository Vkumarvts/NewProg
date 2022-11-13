package Inheritance;

public class Prog1C extends Prog1P {
	
	public void child()
	{
		System.out.println("This is child method");
	}
	public void mobile()
	{
		System.out.println("child have mobile");
	}

	public static void main(String[] args) {
		
		Prog1C a=new Prog1C();
		a.parent();
		a.money();
		a.car();
		
		a.child();
		a.mobile();

	}

}
