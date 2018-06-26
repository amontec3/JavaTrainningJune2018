package com.company.day16w4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Person> people = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39));
		//List <Person> people = new ArrayList<>();

//		Consumer doThis = (s) -> System.out.println(s); 
//
//		people.stream().forEach(p->System.out.println(p.getLastName()));
//		
//		people.stream().forEach(doThis);
//		
//		people.forEach(doThis);
		
		people.stream().filter(foo -> foo.getFirstname().startsWith("C")).forEach(foo -> System.out.println(foo.getFirstname()));
	
//		for(Person p : people) {
//			System.out.println(p);
//		}
//		
//		for(Person p : people) {
//			System.out.println(p.getFirstname());
//		}
//		
//		for(Person p : people) {
//			System.out.println(p.getAge());
//		}
	
	}

	
	
	
}
