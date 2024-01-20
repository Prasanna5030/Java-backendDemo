import java.util.Scanner;
public class methodOverloading {
	public static int add(int x, int y) {
		return x+y;
		
	}
	public static int add(int x, int y, int z) {
		return x+y+2*z;
		
	}
	public static float add(float x, float y, float z) {
		return 2*x+4*y+2*z;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value of a: ");
		int a=sc.nextInt();
		System.out.println("enter value of b: ");
		int b= sc.nextInt();
		System.out.println("enter value of c: ");
		int c= sc.nextInt();
		int result1=add(a,b);
		int result2=add(a,b,c);
		
		System.out.println("enter value of x: ");
		float x= sc.nextFloat();
		System.out.println("enter value of y: ");
		float y= sc.nextFloat();
		System.out.println("enter value of z: ");
		float z= sc.nextFloat();
		float result3= add(x,y,z);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
		
		
		
		
	}


}
