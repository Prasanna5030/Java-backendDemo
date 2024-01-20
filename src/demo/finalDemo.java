package demo;
final class ex{
	final int age=1;
	final String name=null;
	final void display() {
		System.out.println(" display works!");
	}
	
}
// final class cannot be extended 

class ex2 extends ex{
	void display(){       // final method cannot be overridden
		System.out.println(" display2 works!");

	}
}
public class finalDemo {

	public static void main(String[] args) {
		ex e1=new ex();
		e1.name="supriya"; // not possible because of final modifier, final variables cannot be reassigned
		e1.age=12;
	}
}
