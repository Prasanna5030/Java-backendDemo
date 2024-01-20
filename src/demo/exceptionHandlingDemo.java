package demo;
import java.io.*;

public class exceptionHandlingDemo {

	public static void main(String[] args) {
		String file="C:\\Users\\HP\\Java Backend\\src\\JavaNotes.txt";
		try {
		PrintWriter pw =new PrintWriter(file);
		pw.print("hello this is from java program");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}

}
