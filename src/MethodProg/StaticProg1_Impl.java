package MethodProg;

public class StaticProg1_Impl {
	
	//static method call from different class 

	public static void main(String[] args) {
		
		System.out.println("main method staeted");
		StaticProg1.methodA();
		StaticProg1.methodB();
		System.out.println("main method ended");

	}

}
