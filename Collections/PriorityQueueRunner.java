package Collections;

import java.util.PriorityQueue;

public class PriorityQueueRunner {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(4);
		numbers.add(5);
		numbers.add(1);
		numbers.add(6);
		numbers.add(2);
		
		//System.out.println(numbers.remove());
		System.out.println(numbers.peek());//return the head element
		System.out.println(numbers);
		//System.out.println(numbers.get);
		
		
		

	}

}
