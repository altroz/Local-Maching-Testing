package com.FileNavigation;
import java.io.*;

public class FileNavigationTesting {
	public static void main(String[] args){
		
		char []in = new char[500];
		int size = 0;
		try{
			
		File file = new File("MyFile.txt");
		file.createNewFile();
		System.out.println(file.exists());
		
		FileWriter fw = new FileWriter(file);
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lobortis vitae nibh vel <br>"
				+ "accumsan. Praesent ex justo, tempor in venenatis ac, cursus et velit. Morbi rutrum suscipit "
				+ "finibus. Aliquam tincidunt ligula id lectus suscipit, vitae molestie nisl egestas. Aenean neque "
				+ "justo, dictum sed felis ut, scelerisque aliquet magna. Vestibulum dictum, risus sed consectetur "
				);
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(file);
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
