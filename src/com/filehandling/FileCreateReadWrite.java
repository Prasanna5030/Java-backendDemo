package com.filehandling;
import java.io.*;
public class FileCreateReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= null;
		BufferedWriter bw= null;
		try {
			File f1= new File("K.txt");
			f1.createNewFile();
			String filepath=f1.getAbsolutePath();
			
		bw = new BufferedWriter(new FileWriter(filepath));
			bw.write("Hello PK , this is a example test case ");
			br= new BufferedReader(new FileReader(filepath));
			String line;
			while((line=br.readLine())!=null) {
				br.readLine();
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
