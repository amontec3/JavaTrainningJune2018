package com.company.day2;

import java.util.Scanner;
/*if num is odd, print weird
* If num is even and in the inclusive range of 2 to 5, print not Weird
*
* if num is even and in the inclusive range of 6 to 20 , print weird
* if num is even and greater than 20, print not weird
in range of 1 to 100
*/
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value: ");
		num = scan.nextInt();
		scan.close();
		
		//in range of 1 to 100
		if (num >=1 && num<=100) {
			//if num is odd, print weird
			if(num % 2 !=0) { //is odd
				System.out.println("Weird");
			}else {//is even
				if(num >= 2 && num <=5) { // If num is even and in the inclusive range of 2 to 5, print not Weird
					System.out.println("Not Weird");
				}else if (num>=6 && num<=20) { // if num is even and in the inclusive range of 6 to 20 , print weird
					System.out.println("Weird");
				}
				else {//if num is even and greater than 20, print not weird
					System.out.println("Not Weird");
				}
			}
		}
		else {
			System.out.println("Value out of allowed range. 1 to 100");
		}
		
		
	}

}
