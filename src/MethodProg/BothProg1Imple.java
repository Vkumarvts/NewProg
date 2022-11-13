package MethodProg;

public class BothProg1Imple {
	
	public void displayName(String name)
	{
		System.out.println("Student name="+ name);
	}
	public void Sdtgrade(char grade)
	{
		System.out.println("Student grade="+ grade);	
	}

	public static void main(String[] args) {
		
		BothProg1Imple x=new BothProg1Imple();
		x.displayName("Sam");
		x.Sdtgrade('A');
		
		BothProg1.mul(10,2);

	}

}
