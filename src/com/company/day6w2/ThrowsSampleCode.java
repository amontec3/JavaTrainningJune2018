package com.company.day6w2;

import java.io.IOException;

public class ThrowsSampleCode{
	//constructor
	public ThrowsSampleCode() {
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//myTest();
		
		try {
			Example ex = new Example();
			ex.mymethod(1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
//
//	static void myTest() {
//		try {
//			
//		} catch (NumberFormatException e) {
//			// TODO: handle exception
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//		}
//	}
	
}
class Example{//inner class
	void mymethod(int num) throws IOException, ClassNotFoundException{
		if(num==1) {
			throw new IOException("IO Exceptions");
		}else{
			throw new ClassNotFoundException("Class not Found Exceptions");
		}
	}
}
