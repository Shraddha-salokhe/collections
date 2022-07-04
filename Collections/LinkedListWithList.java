package Collections;

import java.util.LinkedList;

public class LinkedListWithList {

	public static void main(String[] args) {
		
		LinkedList <String> animal = new LinkedList<String>();
		
		animal.add("Cat");// 0 index
		animal.add("Lion");// 1
		animal.add("Dog");// 2
		animal.add("Elephant");//3
		
		animal.add(1,"Tiger");// added the element at index 1

		System.out.println(animal);//output all elements
		
		System.out.println(animal.remove(2));//in list method we can use index but in queue we cant use index
	   
		System.out.println(animal.peek());// head element first...output cat
	   
	    System.out.println(animal.element());//first element of the list return but not remove
	   // if the queue is empty while element() method...then throw the exception....in peek...it gives null output
	    
	    System.out.println(animal);
	    
	    System.out.println(animal.poll()); // remove and retrieve first element of list...cat
	    
	    System.out.println(animal);
	}
	

}
