package Interface;

import java.util.Scanner;

public class Progc implements Prog1p {
	
	String Name;
	int No;
	double subjects;
	char grade;
	
	@Override
	public void getstdDetails() {
		
		Scanner a =new Scanner(System.in);
		Name = a.next();
		No = a.nextInt();
		subjects = a.nextDouble();
		grade = a.next().charAt(0);
		
	}

	@Override
	public void showstdDetails() {
		
		System.out.println("Name of student ="+ Name);
		System.out.println("no of student ="+ No);
		System.out.println("subjects of sutdents ="+ subjects);
		System.out.println("grade of student ="+ grade);
		
	}
	

}
