package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class bufferedReaderDemo {

	public static void main(String[] args) {
		String file="C:\\Users\\HP\\Java Backend\\src\\JavaNotes.txt";
		BufferedReader br=null;
		try {
			 br=new BufferedReader(new FileReader(file));
		
			while(br.ready()) {
				String s=br.readLine();
				System.out.println(s);
			}
		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
 