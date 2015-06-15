package com.FileNavigation;
import java.io.*;

public class Test1 {
	public static void main(String [] args){
		char [] in =  new char [50];
		int size =  0;
		
		try{
			File ADirectory=new File("ADirectory");
			ADirectory.mkdir();
			
			File ADirectoryTextFile = new File(ADirectory,"ADirectoryTextFile.txt");
			
			FileWriter fw = new FileWriter(ADirectoryTextFile);
			fw.write("Quick Testing");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(ADirectoryTextFile);
			size = fr.read(in);
			System.out.println(size);
			for(char c: in)
				System.out.print(c);
			
			fr.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
