package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Products{
	int id;
	String name;
	String model;
	double price;
	
  public Products(int id,String name,String model,double price) {
		this.id=id;
		this.name=name;
		this.model=model;
		this.price=price;
	}
		
	public void show(String name, String model) {
		System.out.println(name+"-"+model +"is working !");
	}
}
public class Streams {

	public static void main(String[] args) {
		
		Products p1= new Products(101, "Dell Laptop", "Inspiron 15th gen 8250i", 54000.45);
		Products p2= new Products(101, "HP Laptop", "Inspiron 15th gen 8250i", 64000.15);
		Products p3= new Products(101, "Apple Laptop", "Inspiron 15th gen 8250i", 94000.50);
		Products p4= new Products(101, "Samsung Laptop", "Inspiron 15th gen 8250i", 56000.35);
		Products p5= new Products(101, "lenovo Laptop", "Inspiron 15th gen 8250i", 45000.55);
		Products p6= new Products(101, "Acer Laptop", "Inspiron 15th gen 8250i", 30000.475);
		Products p7= new Products(101, "Asus Laptop", "Inspiron 15th gen 8250i", 52000.05);
		Products p8= new Products(101, "Sony Laptop", "Inspiron 15th gen 8250i", 65000.15);
		
		List<Products> al = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
		
		List<Products> newAl= new ArrayList<Products>();
		
		al.stream().filter(i->i.price>60000.05).forEach(i->System.out.println(i.name));
		al.stream().filter()
	}

}
