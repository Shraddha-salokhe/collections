package Collections;

import java.util.Objects;

public class Student {

	String name;
	int age;
	int RollNo;
	String Course;
	
	//create constructor ==
	
	// right click anywhere and get source option and then get generate constructor using fields
	
	public Student(String name, int age, int rollNo, String course) {
		super();
		this.name = name;
		this.age = age;
		this.RollNo = rollNo;
		this.Course = course;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	
	
	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	// HASHCODE AND EQUALS
	
     public int hashCode() { //...>hashcode returns only integer value
    	 System.out.println("Hashcode is called");
    	 return this.RollNo;
     }
     
     //EQUALS METHOD
     public boolean equals(Object obj) {//...>if the hashcode is same for the both object then call equals method
    	 System.out.println("equals is called");
    	 Student other = (Student)obj;
    	 return other.RollNo == this.RollNo;
    	 
     }
     // tostring method...we can also use this method instead of getter n setter

	@Override//annotation
	
	//we have one parent class of all the objects called objects
	//class object is the root of the class hierarchy. Every class has object as a superclass
	
	public String toString() { //...>toString method belongs to the object class
		return "Student [name=" + name + ", age=" + age + ", RollNo=" + RollNo + ", Course=" + Course + "]";
	}
	
//	@Override
//	public int hashCode() { //...>hashcode returns only integer value
//		return Objects.hash(Course, RollNo, age, name);
//	}

}
      //......>because of hashcode and equals method only one object is printed....
