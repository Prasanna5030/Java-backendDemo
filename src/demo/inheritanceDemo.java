package demo; 
import healthcare.Surgeon;
class engine{
		void enginestart(String name) {
			System.out.println("engine started "+name);
		}
	}
class bike extends engine {
		String name;
		void run() {
			System.out.println(name+"runs full speed at 12,500 rpm");
		}
	}

class car extends engine {
	String name ;
	
	void rev() {
		System.out.println(name+"v8 car revs so louder  ");
	}
}
public class inheritanceDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bike ducati = new bike();
//		ducati.name="panigale v4";
//		ducati.enginestart("v4r");
//		ducati.run();
//		car lamborghini= new car();
//		lamborghini.name="huracan performente";
//		lamborghini.enginestart("6.5 litre naturally aspirated twin turbo engine");
//		lamborghini.rev();
		
		Surgeon s1= new Surgeon ();
		s1.name="dr.satish";
		s1.setAge(24.6f);
		System.out.println(s1.getAge());

		
	}

}
