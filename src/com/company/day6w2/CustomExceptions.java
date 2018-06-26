package com.company.day6w2;

public class CustomExceptions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try block");
			throw new MyException("This is my custom exception");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Catch block");
			System.out.println(e);
			//e.printStackTrace();
		}
	}

}

class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;
	
	public MyException(String str1){
		this.str1 = str1;
	}
	
	public String toString() {
		return "My Exceptions: "+ this.str1;
	}
}
