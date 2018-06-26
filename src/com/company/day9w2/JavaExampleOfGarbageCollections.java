package com.company.day9w2;

public class JavaExampleOfGarbageCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExampleOfGarbageCollections je = new JavaExampleOfGarbageCollections();
		je = null;
		JavaExampleOfGarbageCollections a = new JavaExampleOfGarbageCollections();
		JavaExampleOfGarbageCollections b = new JavaExampleOfGarbageCollections();

		b=a;
		
		System.gc();
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Garbage colection from JVM");
	}

}
