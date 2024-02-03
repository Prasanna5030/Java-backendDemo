package com.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamDemo {

	public static void main(String[] args) throws IOException {
//		InputStreamReader i = new InputStreamReader(System.in);
		String file="C:\\Users\\HP\\Java Backend\\src\\JavaNotes.txt";
		FileReader fr = new FileReader(file);
		try {
			int s=fr.read();
			while(fr.ready()){
			System.out.println((char)s);
			s=fr.read();
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		System.in.close();
		
	}

}
