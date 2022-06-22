package Collections;

public class ArrayRunner {

	public static void main(String[] args) {
		 int student1 = 90;//marks of students
		 int student2 = 78;
		 int student3 = 85;
		 
		 int arr [] = new int[5];// size or length of an array..here studebts r 5
		 arr[0] = 90;//indexing from 0..1st element is 0
		 arr[1]=78;
		 arr[2]=85;
		 arr[3]=50;
		 arr[4]=60;
		 
		 //int age[] ={20,30,40,50};//we can write like this also
		 
		 System.out.println(arr[1]);//arr[1] = 78..output 78
		 
		//for(int index=0; index<age.length; index++) {//if we dont know the size length of array then use
		 
		 for(int index=0; index<=4; index++) {
		 
		 
		System.out.println(arr[index]);
		 
		
		
		 }
	}

}
