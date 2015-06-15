package com.FileNavigation;
import java.io.*;

public class FileDeleteTest {
	public static void main(String[]args){
		String [] files = new String[10];
		String [] files1 = new String[10];
		try{
		File ADirectory = new File ("ADirectory");
		ADirectory.mkdir();
		File ADirectoryTestFile = new File(ADirectory, "ADirectoryTestFile.txt");
		ADirectoryTestFile.createNewFile();
		
		File ADirectoryTestFile2 = new File(ADirectory,"ADirectoryTestFile2.txt");
		ADirectoryTestFile2.createNewFile();
		
		files = ADirectory.list();
		
		for(String fn: files){
			System.out.println("found "+ fn);
		}
		
		
		File RDirectory =new File("RDirectory");
		RDirectory.mkdir();
		ADirectory.renameTo(RDirectory);

		
		files1 = RDirectory.list();
		for(String fa: files1)
			System.out.println("found "+ fa);
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
