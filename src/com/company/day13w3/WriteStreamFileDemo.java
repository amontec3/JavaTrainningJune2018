package com.company.day13w3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Assignment - 

public class WriteStreamFileDemo {
	static BufferedWriter bw = null;
	static String myContent= "This is java I/O content";
	static String myContent2= "\nSecond line";
	public static void main(String[] args) {
		try {
			File file=new File("/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day13w3/myFile.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(myContent);
			bw.write(myContent2);
			System.out.println("File Was written successfully!");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error while writting to file.");
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Error while closing BufferedWriter.");
			}
		}
		
	}

}
