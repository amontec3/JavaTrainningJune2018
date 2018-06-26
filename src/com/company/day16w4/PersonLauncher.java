package com.company.day16w4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.company.day14w3.Student;

@FunctionalInterface
interface ElePrinter{
	void printElements(List<Person> list);
}
@FunctionalInterface
interface ElePrinter2{
	void printElements(List<Person> list, char a);
}

public class PersonLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		Comparator<Person> myComparator = new Comparator<Person>() {
//		    public int compare(Person p1, Person p2) {
//		    	return p1.getLastName().compareTo(p2.getLastName());    	
//		    }};
		    
		ArrayList <Person> arrayList = new ArrayList<>();
		arrayList.add(new Person("Mike", "Lee", 23));
		arrayList.add(new Person("Peter", "Ham", 34));
		arrayList.add(new Person("Dave", "Call", 32));
		

		System.out.println(arrayList);
		
		
		//Collections.sort(arrayList, myComparator);
		//using lambda definition of comparator to pass into Collections.sort() method
		Collections.sort(arrayList, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));    
		
		System.out.println(arrayList);
		
		
		ElePrinter printAll = (list) -> {
				for(Person a:list) {
					System.out.println(a.toString());
				}};
		ElePrinter2 printByLNSW = (list, letter) -> {
			for(Person a:list) {
				if(a.getLastName().charAt(0)==letter) {
					System.out.println(a.toString());
				}
			}};
		System.out.println("Printing all elements:");
		printAll.printElements(arrayList);
		System.out.println("Printing all elements with last name starting with letter L:");
		printByLNSW.printElements(arrayList, 'L');
		

	}

}
