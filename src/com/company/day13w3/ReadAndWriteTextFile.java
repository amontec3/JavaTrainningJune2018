package com.company.day13w3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteTextFile {
	//img path     :   /Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day13w3/omg_cat.jpg
		static String imgPath = "/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day13w3/doc.txt";
		static String imgPathW = "/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day13w3/doc3.txt";	static byte[] bytes;
		static char [] chars;
		
		static void readTextFile(String fn) {
			File f = new File(fn);
			long lenOfFile = f.length();
			
			FileReader fr = null;
			try {
				fr = new FileReader(f);
				int intLength = (int) lenOfFile;
				chars = new char[intLength];
				fr.read(chars);
//				int c;
//				int i = 0;
//				while ((c=fr.read())!=-1) {
//					chars[i]=(char)c;
//					i++;
//				}	
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("File not found.");
			}
			finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Unable to close file.");
				}
			}
		}
		static void writeTextFile(String fn) {
			File f = new File(fn);
			long length = f.length();
			FileWriter fw= null;
			try {
				fw = new FileWriter(f);
				fw.write(chars);
			} catch (IOException e) {
				// TODO: handle exception
				System.err.println(e);
			}finally {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println(e);
				}
			}
			
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			readTextFile(imgPath);
			writeTextFile(imgPathW);
			
		}

}
