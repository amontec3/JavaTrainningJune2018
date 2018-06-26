package com.company.day6w2;

public class TryMultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] num = {23,45,56,67,88,99};
			num[2] = 20/0;
			//num[7] = 20/2;
		
		
		} catch (ArithmeticException e) {
			// TODO: handle exception
			//System.out.println("An error occurred with number.");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			//System.out.println("An error occurred with array index.");
			System.out.println(e.getMessage());

		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Some Exceptions.");
			System.out.println(e.getMessage());

		}
		
		System.out.println("End of all Exceptions");
	}

}
