package com.company.day12w3;

import java.io.File;

//File

public class FileInfo {

	static final int con = 9;
	
	public FileInfo(){
		System.out.println("Created before calling main method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(
				"/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day12w3/InputInfo.txt");

		System.out.println("This is the file size " + file.length());
		System.out.println("This is the file name " + file.getName());
		System.out.println(FileInfo.con);
		
 
		try {
			System.out.println(file.getName()+" File path " + file.getCanonicalPath());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File Error");
		}
	}

}
