package demo;

public class exceptionHandling {

	public static void main(String[] args) {
		int d=doCalculate();
		System.out.print(d);

	}
	static int doCalculate() {
		int c= doDivsion();
		return c;
	}
	static int a=10 ;
	static int b=0;
	public static int doDivsion() {
		// TODO Auto-generated method stub
		int c = 0;
		try {
		  c=  a/b;
		   
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return c;
	}

}
