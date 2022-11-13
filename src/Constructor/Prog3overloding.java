package Constructor;

public class Prog3overloding {
	
	public Prog3overloding()
	{
		System.out.println("This is zero parameter construxtor");
	}
	public Prog3overloding(int a)
	{
		System.out.println("singal parameter="+ a);
	}
	public Prog3overloding(int b,int c)
	{
		System.out.println("two parameter="+ b+ ","+c);
	}
	public Prog3overloding(String mob)
	{
		System.out.println("mobile number="+ mob);
	}

    public static void main(String[] args) {
	Prog3overloding P=new Prog3overloding();
	Prog3overloding Q=new Prog3overloding(50);
	Prog3overloding R=new Prog3overloding(10,20);
	Prog3overloding S=new Prog3overloding("9960715779");	

	}

}
