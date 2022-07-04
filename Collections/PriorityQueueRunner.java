package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueRunner {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(7);
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(0);
		
		
		//System.out.println(numbers.remove());
		//System.out.println(numbers.peek());//return the head element
		//System.out.println(numbers);
		//System.out.println(numbers.get);
		
		//with using iterator
		Iterator it = numbers.iterator();
    	while(it.hasNext()) {  ///....if there has more element then keep on executing...means true
			System.out.println(it.next());
		}
		
//		System.out.println(numbers.poll());
//		System.out.println(numbers.poll());
//		System.out.println(numbers.poll());
//		System.out.println(numbers.poll());
//		System.out.println(numbers.poll());
//		System.out.println(numbers.poll());
//		System.out.println(numbers.poll());
//		
//		
		
		
		PriorityQueue<String> cities = new PriorityQueue<String>();// using string
		
		cities.add("Calcutta");
		cities.add("Agra");
		cities.add("Banglore");
		cities.add("Delhi");
		
		System.out.println(cities);
		
//		Iterator it1 = cities.iterator();
//		while(it1.hasNext()) {
//			System.out.println(it1.next());
//		}
		
		//we can use iterator also
		//Iterator it = numbers.iterator();
		//while(it.hasNext()) {
		//	System.out.println(it.next());

		}
		
		

	}


