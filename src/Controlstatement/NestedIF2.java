package Controlstatement;

public class NestedIF2 {

	public static void main(String[] args) {
		int age= 24;
		int weight=45;
		
		if(age>=21&&age<=50)
		{
			System.out.println("eligible to donate blood");
			if(weight>=50 && weight<=120)
			{
				System.out.println("Healthy and Eligible ");
			}
			else
			{
				System.out.println("weight must be >50 and <150");
			}
				
			}
			else
			{
				System.out.println("age must be >21 and <50");
			}
			
		}

	}


