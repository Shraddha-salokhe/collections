package Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapRunner2 {
	
	public static void main(String []args) {
		
		HashMap<Integer , String> map = new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2,"two");
		map.put(2,"TWO");//...>IF THERE IS ANY DUPLICATE VALUE THEN IT REPLACE WITH NEWLY ENTERED VALUE
		
		System.out.println(map.get(1));//..>we can also provide the key to print particular key value
		
		System.out.println(map);
		
		map.replace(1,"ONE"); //....>it replace the value
		
		System.out.println(map.keySet());//...>get the only all key set
		
		System.out.println(map.values());//....>get all values only
		
		Set<HashMap.Entry<Integer,String>> values = map.entrySet();
		
		for(HashMap.Entry<Integer,String> e:values) {
			
			System.out.println(e.getKey()+ " : " + e.getValue());
			
			
			//student.java,hashsetrunner class
			HashMap<Student, Integer> students = new HashMap<Student,Integer>();
			
			Student std1 = new Student("ABC", 20,1,"phase1");
			Student std2 = new Student("ABC", 20,1,"phase1");
			
			students.put(std2, 1);//...>key,value
			students.put(std1, 1);
			System.out.println(students);
			
			//System.out.println("Is the key std1 present?" + students.containsKey(std1));
		}
		
	}

}
