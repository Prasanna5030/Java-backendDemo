package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderDemo {

	public static void main(String[] args)  {
		BufferedReader br=null;
		try {
		br=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\phase-1 project\\netflixgpt.txt"));
		}catch(FileNotFoundException e){
			System.out.println("FNF exception ");
		}
		String i ;
		try {
		while((i=br.readLine())!=null){
			System.out.print(i);    
	         
		}
		}catch(IOException e){
			System.out.println("IO exception ");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
