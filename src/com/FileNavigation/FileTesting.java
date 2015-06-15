package com.FileNavigation;
import java.io.*;

public class FileTesting {
	public static void main(){
		
		char[] in = new char [20];
		int size =0;
		
		try{
		File f = new File("Test.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This is a quick test");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(f);
		size = fr.read(in);
		System.out.println(size + " ");
		
		for(char c : in){
			System.out.print(c);
		}
		fr.close();
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
