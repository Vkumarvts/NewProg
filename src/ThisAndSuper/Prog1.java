package ThisAndSuper;

public class Prog1 {
	
	int num1=100;  //this is global Variable
	public Prog1(int num1) //this is local variable
	{
	
		System.out.println("This is local variable="+ num1); //Local
		System.out.println("This is Global variable="+ this.num1);//100 globale
	}
	
	public static void main(String[]args) {
		Prog1 a=new Prog1(10);
		
		
		
	}

}
