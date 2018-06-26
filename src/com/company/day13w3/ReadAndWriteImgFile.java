package com.company.day13w3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteImgFile {
	//img path     :   /Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day13w3/omg_cat.jpg
	static String imgPath = "/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day13w3/omg_cat.jpg";
	static String imgPathW = "/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day13w3/omg_catWrite.jpg";	static byte[] bytes;
	
	static void readFileArray(String fn) {
		File f = new File(fn);
		long lenOfFile = f.length();
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			int intLength = (int) lenOfFile;
			bytes = new byte[intLength];
			fis.read(bytes);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("File not found.");
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Unable to close file.");
			}
		}
	}
	static void writeArrayToFile(String fn) {
		File f = new File(fn);
		long length = f.length();
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(f);
			fos.write(bytes);
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e);
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println(e);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFileArray(imgPath);
		writeArrayToFile(imgPathW);
		
	}

}
