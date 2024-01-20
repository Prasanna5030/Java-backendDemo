package demo; 
class animal{
	 void sleep() {
		 System.out.println("animal sleeps");
	 }
 void eat() {
	 System.out.println("Animal eats");
 }
}
 class dog extends animal{
	 void eat() {
		 System.out.println("dog eats pedigree");
	 }
	 void sleep() {
		 System.out.println("dog sleeps");
	 }
 }
 class cat extends animal{
	 void eat() {
		 System.out.println("cat eats fish");
	 }
	 void sleep() {
		 System.out.println("cat sleeps");
	 }
 }



public class overridingDemo {

	public static void main(String[] args) {
		dog jimmy= new dog();
		cat pilli =new cat();
		
		jimmy.eat();
		jimmy.sleep();
		pilli.eat();
		pilli.sleep();

	}

}
