package com.filehandling;
import java.io.*;


public class FilesHandlingDemo {

	public static void main(String[] args) {
		
//		String file="C:\\Users\\HP\\Java Backend\\src\\JavaNotes.txt";
		try {
			
			// creating new file
			File f1= new File("javaNotes.txt");
			Boolean b=f1.createNewFile();
			String filepath= f1.getAbsolutePath();
			filewrite(filepath);
		} catch (IOException e) {
		e.printStackTrace();
		}
		
	}
	public static void filewrite(String file) {
		BufferedWriter bw= null;
		try {
			// writing into file
			 bw= new BufferedWriter(new FileWriter(file));
			String s="hello this is a example test";
			bw.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
