package healthcare;
public class Doctor {
int id;
public String name;
private float age;
char gender;
String designation;
boolean isOnDuty;


// getter and setters for private age
public float getAge() {
	return this.age;
}

public void setAge(float age) {
	this.age= age;
}

// constructors 
public Doctor(String name, float age) {
	this.name= name;
	this.age= age;
	
}
public Doctor(String name ) {
	this.name=name;
}

public Doctor(String name , float age, char gender) {
	this.name= name;
	this.age= age;
	this.gender=gender;
	
}
void examinepatient() {
	System.out.println("inside examine patient");
}
void prescribemedicine() {
	System.out.println("inside prescribe medicine");
}
}
