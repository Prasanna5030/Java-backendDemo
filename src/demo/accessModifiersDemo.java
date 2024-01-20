package demo;

class demo{
	private String name;
	private float age;
	  public String getName() {
	   return this.name;
	   }
	   public void setName(String name) {
	   this.name=name;
	   }
	   public float getAge() {
		   return this.age;
	   }
	   public void setAge(int age) {
		   this.age=age;
	   }
	}

public class accessModifiersDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d1=new demo();
		d1.setName("prasanna");
		System.out.println(d1.getName());
		d1.setAge(24);
		System.out.println(d1.getAge());
	}

}
