package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListRunner {

	public static void main(String[] args) {
		
		//using queue...we use linkedlist also..instead of queue...only use add in offer place
		
		Queue<String> animal = new LinkedList<>();
		
		animal.offer("Dog");//...>adding element..use offer
		animal.offer("Cat");
		animal.offer("Lion");
		
		//System.out.println(animal.peek());//print dog..for print output use peek
		
		System.out.println(animal.remove());//removing element...dog
	    
		//element() returns the first element. if the queue is empty
		//then it will return null.
		System.out.println(animal.element());
		System.out.println(animal);//cat,lion...dog removed
		
		System.out.println(animal.peek());//output cat...because we deleted dog..in remove method
		//in peek...first in ...head is first
	    
	
	}
	
	
	
	

}
