package ThisAndSuper;

public class Prog2 {
	
	public Prog2()
	{
		System.out.println("non parametrized constructor");
	}
	public Prog2(int a)
	{
		this();
		System.out.println("this is parametrized constructor");
		System.out.println("A="+ a);
	}

	public static void main(String[] args) {
		Prog2 b=new Prog2(25);

	}

}
