
public class firstJavaClass {

	public static void main(String[] args) {
		 Student student1= new Student();//this will call default constructor/no argument constructor
		 System.out.println(student1.name);
		//two ways to assign values
		 //way 1:assigning values to the properties
		 
		 student1.name="shraddha";
		 student1.rollNo=123;
		 
		 //way 2:or we can use constructors to assign values to properties/instance variables
	    Student student2= new Student("Shraddha", 123, "FSD Phase1") ; 
	    System.out.println(student2.name);
	    
	    Student student3= new Student("neeraj", 23 , "java");
	    System.out.println(student3.courseEnrolled);
	}

	}
	class Student{ // ...>encapsulation
		String name;  //...properties or data or instance variables
		int rollNo;
		String courseEnrolled;

		//method
		void attendSession() {
			//open webex
		}
			
		//constructor---->no arguments constructor
		Student(){
			}
		
		//parameterized constructor
		Student(String Name, int Roll, String course){
			
			name= Name;
			rollNo = Roll;
			courseEnrolled= course;
			
		}
	
		
	



	}


