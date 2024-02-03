package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

	public static void main(String[] args) {
		
		File f1= new File("Sample.txt");
		try {
			//creating new file
			f1.createNewFile();
			String fileLocation=f1.getAbsolutePath();
			Path path= Path.of(fileLocation);
			String content="Hello brother this is a sample text from a program \n please delete it after use";
			
			
			//Writing data into files
			Files.writeString(path, content);
			//Reading data from files using path
			String data= Files.readString(path);
			System.out.println(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
