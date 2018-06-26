package com.company.day3;

public class ForLoop {
	//ASSIGNMENT: REVIEW WHAT IS HEAP AND STACK
	
	/*STACK:
	 * Stack is memory space, reserved by operating system for our process
	 * Size of stack memory is fixed, it is determined in the compiler phase based on variables declaration and other compiler options.
	 * When memmory is full, then java runtime throws jav.lang.StackOverflowError
	 * 
	 * Method invocation and local variables lives in stack memory
	 * Stack memory used for execution of a thread
	 * Remember that Stack memory is always referenced in LIFO (Last-In-First-Out) order, it does means when we call a method, it will be on top of a call stack
	 * Method stack exists only till life of method, from the calling until the return
	 * 
	 * Local variables are also known as slack variables, because they are on the method stack, they exist as long as the method is executed
	 * If the local variable is a reference to an object, only the variable goes on the stack
	 * Main method is a special method (the process starts and ends with main) its local variables exist for the entire execution of the process
	 * 
	 * HEAP
	 * jAVA heap space is used by java runtime to allocate memory to objects and JRE classes
	 * Remember whever we create any object, its always created in the heap Space
	 * The JVM allocated java heap memory from the operating system and then manages the heap space for the java application
	 * When an application creates a new object, the JVM sub-allocates a contiguous area of heap memory to store it.
	 * 
	 * */
	
	
	// TODO Auto-generated method stub
			/* For Loop
			 *  for(initialization; condition ; increment/decrement){
			 *  	statement(s);
			 *  }
			 * For Each Loop
			 * */
	public static void main(String[] args) {
		
		for (int i = 0;i<10;i++) {
			System.out.println("Print i = " +i);
		}
		
	}

}
