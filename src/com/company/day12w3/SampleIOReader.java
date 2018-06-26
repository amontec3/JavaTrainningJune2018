package com.company.day12w3;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class SampleIOReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = "Java IO package session";
		Reader reader = new StringReader(str);
		
		System.out.println();
	
		try {
			int c;
			while ((c=reader.read())!=-1) {
				System.out.print((char)c);
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			reader.close();
		}
	}

}
