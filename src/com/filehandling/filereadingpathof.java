package com.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class filereadingpathof {

	public static void main(String[] args) {
		String file ="C:\\Users\\HP\\Java Backend\\Notes.txt";
		Path path=Path.of(file);
		try {
			String result = Files.readString(path);
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

} 	
