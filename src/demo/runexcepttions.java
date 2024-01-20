package demo;
class exceptionss{
	public void subMethod() {
		try {
		sub2Method();
		}catch(Exception e) {
			System.out.println("error handled");
		}
	}
	public void sub2Method() {
		ArithmeticException e =new ArithmeticException("sub 2 error");
		throw e;
		
	}
}

public class runexcepttions {
	
	public static void main(String[] args ) {
		exceptionss e1= new exceptionss();
		e1.subMethod();
		System.out.println("graceful exit");

	}
  
}
