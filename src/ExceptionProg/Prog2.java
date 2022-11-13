package ExceptionProg;

public class Prog2 {

	public static void main(String[] args)throws InterruptedException {

		int a=10,b=0,c;
		c=a/b;
		System.out.println("main started");
		System.out.println("Output="+c);
//		throw new ArithmaticException();
		
		System.out.println("Main ended");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}

}
