package demo ;
public class overloadingDemo {
	static int a,b;
	public overloadingDemo(int x , int y) {
		this.a=x;
		this.b=y;
	}
	
	void add() {
		System.out.println("No params add");
	}
	
	int add(int x, int y) {
		int result= x+y;
		System.out.println("Result 1 :"+result);
		return result;
	}
	
	float add(int x, int y, int z) {
		int result= x+y+z;
		System.out.println("Result 2 :"+result);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingDemo p1= new overloadingDemo(20,30);
		p1.add(2,4,6);
		int x=a;
		int y=b;
		System.out.println("value of x "+x);
		System.out.println("value of y "+y);
	}

}
