package ThisAndSuper;

public class Prog3 {
	
	int num1=500; //instance or global variable
	
	public Prog3(int num1) //4220 //this is constructor method
	{
		System.out.println("local parameter of num1="+ num1);
		System.out.println("global parameter of num1="+ this.num1); 
	} //to call global variable use this keyword
	public void showValue(int num1) //this is normal non static method
	{
		System.out.println("value of local num1="+ num1);
		System.out.println("global parameter of num1="+ this.num1);
	}

	public static void main(String[] args) {
		
		Prog3 a=new Prog3(4220);
		a.showValue(555);
		
		

	}

}
