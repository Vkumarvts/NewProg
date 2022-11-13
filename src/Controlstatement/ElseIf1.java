package Controlstatement;

public class ElseIf1 {

	public static void main(String[] args) {
		int time =21;
		
		if(time>= 6 && time<= 12)
		{
			System.out.println("Good morning");
		}
		else if (time>= 12 && time<= 15)
		{
			System.out.println("Good afternoon");
		}
		else if (time>=15 && time<= 18)
		{
			System.out.println("Good evenimg");
		}
		else
		{
			System.out.println("Good night");
		}

	}

}
