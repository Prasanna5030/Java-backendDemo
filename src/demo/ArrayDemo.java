package demo;
import healthcare.User;
public class ArrayDemo {

	public static void main(String[] args) {
		
		System.out.println("Array Demo \n ");

		String[] sname=  {"bannu","madhu","mahesh","bob", "justin"};
		for(int i=0;i<sname.length;i++) {
			System.out.println(sname[i]);
		}
		
		
		char[] gender=new char[2];
		gender[0]='m';
		gender[1]='f';
		for(int i=0; i<gender.length;i++) {
			System.out.println(gender[i]);
		}
		
		User[] users= new User[10];
		users[0] = new User();
		
		users[0].setName("iglesias")
		System.out.print("user is "+users[0].getName() );
		
		//multi- dimensional arrays 
		System.out.println("multi  dimensional arrays");
		String[] cars1= {"lamborghini", "ferrari", "mercedes", "bmw", "audi"};
		String[] cars2= {"bugatti", "koenisegg", "mclaren", "porsche","aston martin"};
		String[] cars3= {"afla romeo","lexus", "dodge", "ford", "lotus"};
		
		String[][] carsArr= {cars1,cars2,cars3};
		
		//printing the three-dimensional array
		
		
		for(int i=0;i<carsArr.length;i++) {
			for(int j=0; j<cars1.length;j++) {
				
					System.out.print(carsArr[i][j]+" ");
				
			}
			System.out.println('\n');
		}
		
		System.out.println("multi - dimensional arrays  example -2:\n ");
			
		int[][] nums =new int[3][4];
		
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums[i].length;j++) {
				nums[i][j]=(int)(Math.random()*100);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println('\n');
		}
		
		System.out.println("multi - dimensional arrays  example -3:\n ");
		
		int[][][] random= {{{0,1,2},{2,1,4},{3,1,2}},{{4,1,2},{5,1,4},{6,1,2}},{{7,1,2},{8,1,4},{9,1,2}}};
		
		for(int i=0;i<random.length;i++) {
			for(int j=0;j<random[i].length;j++) {
				for(int k=0 ; k<random[i][j].length;k++)
				System.out.print( random[i][j][k]+" ");
			}
			System.out.println('\n');
		}
		
	}

}
