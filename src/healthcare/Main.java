package healthcare;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1= new Doctor();
		d1.name="Satya";
		d1.age=12.1f;
		d1.isOnDuty=true;
		d1.examinepatient();
		System.out.print("doctors name age and isonduty is"+d1.age);
		System.out.println();
	}

}
 