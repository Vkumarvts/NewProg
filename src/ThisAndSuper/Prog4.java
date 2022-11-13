package ThisAndSuper;

public class Prog4 {
	
	public Prog4()
	{
		this(20);
		System.out.println("this is zero parameter constructor");
	}
	public Prog4(int a)
	{
		System.out.println("parameterized constructor");
		System.out.println("A="+a);
	}

	public static void main(String[] args) {
		Prog4 b=new Prog4();

	}

}
