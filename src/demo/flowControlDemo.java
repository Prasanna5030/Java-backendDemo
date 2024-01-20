package demo;
public class flowControlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for-loop demo
		System.out.println("for loop demo ");

		int n=5;
		for(int i=0;i<=10;i++) {
			System.out.println(i*n);
		}
		
		
		System.out.println("\n\n for loop demo ");

		
		for(int i=5; i<=10;i++) {
			if(i%2==0)
			System.out.println(i*i*i);
		}
		
	// switch demo 
		System.out.println("\n \n Switch case demo ");
		switch(n=4) {
		case 1:
			System.out.println("Monday");
			break;
		
	   case 2:
		System.out.println("tuesday");
		break;
	   case 3:
			System.out.println("wednesday");
			break;
	   case 4:
			System.out.println("thursday");
			break;
	   case 5:
			System.out.println("friday");
			break;
	   case 6:
			System.out.println("saturday");
			break;
	   case 7:
			System.out.println("sunday");
			break;
		
		}
		
	}

}
