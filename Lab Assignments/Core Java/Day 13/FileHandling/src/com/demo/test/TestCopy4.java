package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy4 {
	public static void main(String[] args) {
	
		File f=new File("myfilecopy.txt");
		FileOutputStream fos=null;
		try {
			
			if(f.exists()) {
			//open file in append mode
				fos=new FileOutputStream("myfilecopy.txt",true);
			}
			else {
				//open file in write mode
				
				fos=new FileOutputStream("myfilecopy.txt");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		//open file in autoclosable resource block
		try (FileInputStream fis=new FileInputStream ("myfile.txt");
				FileOutputStream fos1=fos;){
			//copy the contents from one file to another
			int i=fis.read();
			//to check the end of file
			while(i!=-1) {
				fos1.write(i);
				i=fis.read();
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
