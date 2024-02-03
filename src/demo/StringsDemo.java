package demo;

public class StringsDemo {

	public static void main(String[] args) {
		
		System.out.println("String class demo \n");
		String s1= new String("prasanna");
		String s2= new String("prasanna");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("StringBuffer Demo \n");
		StringBuffer sb1= new StringBuffer("prasanna");
		StringBuffer sb2= new StringBuffer("prasanna");
		System.out.println(sb1==sb2);     
		                             // return false because == operator always refers to the reference object
		System.out.println(sb1.equals(sb2));
		                           //equals method of StringBuffer class was not overridden from equals() method of object class always refers to the object reference hence it will return false

		
		
		System.out.println("================================================== \n");
	
		String s="prasannakumar";
		
		
		System.out.println(s);
		System.out.printf(" Char at index 3 is %s \n", s.charAt(3));
		System.out.printf("Concatenated String is %s \n",s.concat("muramalla"));
		System.out.printf("equals return %s \n" ,s.equals(s1));
		System.out.println(s.isEmpty());
		System.out.printf("length of the String is %s  \n",s.length());
		System.out.printf("replacing charecters %s \n", s.replace('a', 'b'));
		System.out.printf("SubString is %s \n", s1.substring(3));
		System.out.printf("SubString is %s \n", s1.substring(4,8));
		System.out.printf("Index of charecter k is %s \n",s.indexOf('k'));
		System.out.printf("LastIndex of charecter a is %s \n ", s.lastIndexOf('a'));
		System.out.printf("given string in lowercase is %s \n", s.toLowerCase());
		System.out.printf("Given String in uppercase is %s \n",s.toUpperCase() );
	
		
		
		
	}

}