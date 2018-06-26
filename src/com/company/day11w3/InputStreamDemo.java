package com.company.day11w3;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputStreamDemo {
	
	public static void main(String[] args) {
		InputStream is = null;
		int i;
		char c;
		//byte will convert values in to byte data type
		
		
		try {
			Path path = Paths.get("/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day11w3/SomeInputFile.txt");
			byte[] data = Files.readAllBytes(path);
			
			//new input stream created  "/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day11w3/SomeInputFile.txt"
			//is = new FileInputStream("/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day11w3/SomeInputFile.txt"); 
			is = new ByteArrayInputStream(data);
			is = new PipedInputStream();

			System.out.println("Characters printed:");
			
			// reads till the end of the stream
			while ((i=is.read()) != -1) {
				//converts integer to character
				c = (char) i;
				//prints character
				System.out.print(c);
			}
		
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("An Error Occurred");
		}
		finally {
			if(is != null) {
				try {
					is.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					System.out.println("An error occurred whole closing the stream");
				}
			}
		}
		
		
	}
	
	
	
	
	

}
