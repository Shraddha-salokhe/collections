package Collections;

import java.util.ArrayList;//arraylist with all collections they are in this package ..

public class ArrayListRunner {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(12);//method
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		
		//for change the value
		arraylist.set(3, 60);// change the value of the 3 index..40 change in 60
		
		System.out.println(arraylist);
		
		//for removing
		arraylist.remove(0);
		
		//for add
		arraylist.add(1,40);
		
		System.out.println(arraylist);
		
		//for(int i=0; i< arraylist.size();i++) {//using for loop//this is the way of iteration
			//System.out.println(arraylist.get(i));
		}
	}


