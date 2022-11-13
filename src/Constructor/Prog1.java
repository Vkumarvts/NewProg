package Constructor;

public class Prog1 {
	
	public Prog1()
	{
		System.out.println("This is constructor");
	}
	
	public void show()
	{
		System.out.println("this is show method");
	}
	
	public static void main(String[]args) {
		Prog1 a=new Prog1();
		a.show();
		
	}

}
