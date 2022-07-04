package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRunner {

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();//not return duplicate value
		
		
		Student std1 = new Student("ABC", 20,1,"phase1"); //....>object 1
		
		//student class hashcode method
		//System.out.println("Hashcode:"+ std1.hashCode());
		
        students.add(std1); // refference variable
		
		Student std2 = new Student("ABC", 20,1,"phase1");  //....>object 2
		students.add(std2); //refference variable
		
//		cities.add("Agra");
//		cities.add("Banglore");
//		cities.add("Calcutta");//not return 2 time...duplicate not return
//		cities.add("Calcutta");
		
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			
		System.out.println(it.next());// this allowed when we use toString method in student class
			
        //Student std = it.next(); // use while getters and setters method
//	    
//		System.out.println(std.getName());
//		System.out.println(std.getAge());
//		System.out.println(std.getRollNo());
//		System.out.println(std.getCourse());
		}
	}

}
