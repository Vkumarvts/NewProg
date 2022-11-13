package Controlstatement;

public class NestedIf {

	public static void main(String[] args) {
		String fbusarname = "Harry@gmail.com";
		String fbpassword = "Harry@1234";
	   
		if(fbusarname == "Harry@gmail.com")
		{
			System.out.println("correct usarname");
			if(fbpassword == "Harry@1234")
			{
				System.out.println("Login sucessful,welcom to fb");
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
		else
		{
			System.out.println("Incorrect usarname");
		}
		
	

	}

}
